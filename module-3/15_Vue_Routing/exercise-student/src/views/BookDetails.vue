<template>
  <book-details v-bind:book="NewBook" />
</template>

<script>
import BookDetails from '../components/BookDetails.vue'
export default {
  components: { BookDetails },
  computed:{
    NewBook(){
      const bookToWork = this.$route.params.isbn
      return this.$store.state.books.find(book => book.isbn == bookToWork)
    }
  }

}
</script>

<style>

</style>