<template>
  <section>
    <h1>{{book.title}}</h1>
    <h2>{{book.author}}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <p v-if="book.read"> I have read this book</p>
    <p v-if="! book.read">I have not read this book</p>
  </section>
</template>

<script>

export default {
  name: 'book-details',
  props: {
    book: Object
  }
};
</script>

<style>
</style>