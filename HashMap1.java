Map<String, Object> map = ...;

for (String key : map.keySet()) {
    // ...
}
If you only need the values, use values():

for (Object value : map.values()) {
    // ...
}
Finally, if you want both the key and value, use entrySet():

for (Map.Entry<String, Object> entry : map.entrySet()) {
    String key = entry.getKey();
    Object value = entry.getValue();
    // ...
}