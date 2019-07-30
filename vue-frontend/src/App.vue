<template>
  <div id="app" class="container mt-5">
    <div class="custom-file">
      <input type="file" class="custom-file-input" id="customFile" />
      <label class="custom-file-label" for="customFile">Choose file</label>
    </div>
  </div>
</template>

<script>
import bsCustomFileInput from 'bs-custom-file-input'

export default {
  name: "app",
  created() {
    bsCustomFileInput.init()
  },
};
</script>

<style scoped>

</style>

