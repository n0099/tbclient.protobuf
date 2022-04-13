package GetAlbumPhotoList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlbumPhoList extends Message {
  public static final String DEFAULT_ALBUM_ID = "";
  
  public static final String DEFAULT_BIG_PIC = "";
  
  public static final String DEFAULT_PICTURE_ID = "";
  
  public static final String DEFAULT_SMALL_PIC = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String album_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String big_pic;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String picture_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String small_pic;
  
  public AlbumPhoList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.picture_id;
      if (str1 == null) {
        this.picture_id = "";
      } else {
        this.picture_id = str1;
      } 
      str1 = paramBuilder.album_id;
      if (str1 == null) {
        this.album_id = "";
      } else {
        this.album_id = str1;
      } 
      str1 = paramBuilder.small_pic;
      if (str1 == null) {
        this.small_pic = "";
      } else {
        this.small_pic = str1;
      } 
      str = paramBuilder.big_pic;
      if (str == null) {
        this.big_pic = "";
      } else {
        this.big_pic = str;
      } 
    } else {
      this.picture_id = ((Builder)str).picture_id;
      this.album_id = ((Builder)str).album_id;
      this.small_pic = ((Builder)str).small_pic;
      this.big_pic = ((Builder)str).big_pic;
    } 
  }
}
