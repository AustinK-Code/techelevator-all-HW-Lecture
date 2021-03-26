<template>
  <form class = "new-book-form" v-on:submit.prevent="addNewBook">
      <div class = "title-input">
          <label for="title">Book Title:</label>
          <input type="text" name= "title" v-model="newBook.title">
      </div>
      <div class = "author-input">
          <label for="author">Book Author:</label>
          <input type="text" name= "author" v-model="newBook.author">
      </div>
      <div class = "isbn-input">
          <label for="isbn">Book isbn:</label>
          <input type="text" name= "isbn" v-model="newBook.isbn">
      </div>
      <input type="submit" value="Save" />
  </form>
</template>

<script>
export default {
    data(){
        return{
            newBook:{
                read:false
            }
        }
    },
    methods:{
        addNewBook(){
            this.$store.commit('ADD_BOOK',this.newBook)
        }
    }
}
</script>

<style>

</style>