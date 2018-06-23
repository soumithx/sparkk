val llist = Seq(("soumith","12-1993-1",1),("alice","1-1-1",2))
val left = llist.toDF("name","date","duration")
val right = Seq(("soumith","12-1993-1",2),("bob","2-2-2",3)).toDF("name","upload")
val right = Seq(("soumith","12-1993-1",2),("bob","2-2-2",3)).toDF("name","upload date","duration")
val df = left.join(right,left.col("name") === right.col("name"))
df.show()

