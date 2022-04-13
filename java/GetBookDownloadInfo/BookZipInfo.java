package GetBookDownloadInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BookZipInfo extends Message {
  public static final String DEFAULT_MD5 = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_SIZE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String md5;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String size;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public BookZipInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.size;
      if (str1 == null) {
        this.size = "";
      } else {
        this.size = str1;
      } 
      str = paramBuilder.md5;
      if (str == null) {
        this.md5 = "";
      } else {
        this.md5 = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
      this.size = ((Builder)str).size;
      this.md5 = ((Builder)str).md5;
    } 
  }
}
