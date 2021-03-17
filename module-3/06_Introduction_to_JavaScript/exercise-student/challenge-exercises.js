/*
1. **iqTest** Bob is preparing to pass an IQ test. The most frequent task in this test 
    is to find out which one of the given numbers differs from the others. Bob observed
    that one number usually differs from the others in evenness. Help Bob — to check his 
    answers, he needs a program that among the given numbers finds one that is different in 
    evenness, and return the position of this number. _Keep in mind that your task is to help 
    Bob solve a real IQ test, which means indexes of the elements start from 1 (not 0)_

		iqTest("2 4 7 8 10") → 3 //third number is odd, while the rest are even
		iqTest("1 2 1 1") → 2 // second number is even, while the rest are odd
		iqTest("") → 0 // there are no numbers in the given set
        iqTest("2 2 4 6") → 0 // all numbers are even, therefore there is no position of an odd number
*/
    function iqTest(x){
        let result = 0
        let toArr = x.split(" ")
        let oddArr = toArr.filter(Number => Number % 2 == 1)
        let evenArr = toArr.filter(Number => Number % 2 == 0)
        if (evenArr.length == 1 && oddArr.length > 0){
            num = evenArr[0]
            result = toArr.indexOf(num)+1
        }
        if (oddArr.length == 1 && evenArr.length >0){
            num = oddArr[0]
            result = toArr.indexOf(num)+1
        }
        return result}
/*
2. **titleCase** Write a function that will convert a string into title case, given an optional 
    list of exceptions (minor words). The list of minor words will be given as a string with each 
    word separated by a space. Your function should ignore the case of the minor words string -- 
    it should behave in the same way even if the case of the minor word string is changed.


* First argument (required): the original string to be converted.
* Second argument (optional): space-delimited list of minor words that must always be lowercase
except for the first word in the string. The JavaScript tests will pass undefined when this 
argument is unused.

		titleCase('a clash of KINGS', 'a an the of') // should return: 'A Clash of Kings'
		titleCase('THE WIND IN THE WILLOWS', 'The In') // should return: 'The Wind in the Willows'
        titleCase('the quick brown fox') // should return: 'The Quick Brown Fox'
*/

        /*function titleCase(original, delimiters){     WHY DOESN'T THIS WOOOOOOOORRKKKK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        let ogArr = original.split(" ")
        let delimitersArr = []
        let resultArr = []
        if (delimiters){
        delimitersArr = delimiters.split(" ")
        }
        ogArr[0] = capitalize(ogArr[0])
        resultArr.push(ogArr[0])
        for(let i = 1; i < ogArr.length; i++){
            let found = false
            let delimit = ""
            if(delimiters){
                for(let x = 0; x < delimitersArr.length; x++){
                    if(ogArr[i].toUpperCase === delimitersArr[x].toUpperCase){
                        found = true
                        console.log(ogArr[i])
                        delimit = delimitersArr[x]
                    }
                }
            }
            if (found == true){
                resultArr.push(delimit)
            }
            else resultArr.push[capitalize(ogArr[i])]
        }
        return resultArr
        }*/


        //Taking the easy way out. I am weak.
        function titleCase(original, delimiters){
            let ogArr = original.split(" ")
            let outputArr = []

            for(let i = 0; i < ogArr.length; i++){
                outputArr.push(capitalize(ogArr[i]))
            }

            if(delimiters){
                let delimArr = delimiters.split(" ")
                for (let index = 0; index < delimArr.length; index++ ){
                    let delimWord = capitalize(delimArr[index])
                    if(outputArr.includes(delimWord,1)){
                        let indexOfWord = outputArr.indexOf(delimWord,1)
                        outputArr[indexOfWord] = delimWord.toLowerCase()
                    }
                }
            }
            console.log(outputArr)
            return outputArr.join(" ")
        }
        function capitalize(word){
            let lowerEnd = word.substring(1).toLowerCase()
            let firstCap = word.charAt(0).toUpperCase() 
            return firstCap+lowerEnd
        }