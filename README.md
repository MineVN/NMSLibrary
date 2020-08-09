
# Installation
- Copy NMSLibrary.jar to plugins folder 
- Download here: [releases](https://github.com/RemVN/NMSLibrary/releases) 
# Maven

  ```markup
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```

```markup
	<dependency>
	    <groupId>com.github.RemVN.NMSLibrary</groupId>
	    <artifactId>NMSLibrary_API</artifactId>
	    <version>1.2</version>
  		<scope>provided</scope>
	</dependency>
```

# How to use 
- **Javadoc:** [latest](https://javadoc.jitpack.io/com/github/RemVN/NMSLibrary/NMSLibrary/1.3/javadoc/)

#### I. Depend it in your plugins.yml:

  `depend: [NMSLibrary]`

#### II. Usage

> Adding a String tag to ItemStack
>

```java
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		NBT nbt = NMSLibrary.getAPI().getNBT();
		nbt.addStringTag(item, "TagName", "TagValue");
```
> Getting a String tag from ItemStack
>

```java
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		NBT nbt = NMSLibrary.getAPI().getNBT();
		String value = nbt.getStringTag(item, "TagName");
```



