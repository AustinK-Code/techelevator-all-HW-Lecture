<template>
  <div id="card" class="card">
      <h1 class="book-title">{{book.title}}</h1>
      <h2 class="book-author">{{book.author}}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <button id= "readButton" class="read" v-on:click.prevent="flipStatus(book)">{{showStatus(book.read)}}</button>
    
  </div>
</template>

<script>
export default {
    name: 'book-card',
    props:['book'],
    components:{},
    methods: {
        changeButtonClass(book){
        let button = document.getElementById("card")
        if (book.read === true){
            button.classList.add("mark-read")
            button.classList.remove("mark-unread")
        }
        else if (book.read === false){
            button.classList.remove("mark-read")
            button.classList.add("mark-unread")
        }
        },
        showStatus(status){
            if(status===true){
                return "unread"
            }
            else if(status === false){
                return "read"
            }
        },
        flipStatus(bookO){
            this.$store.commit('TOGGLE_BUTTON',bookO)
            this.changeButtonClass(bookO)
        }
    }
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>