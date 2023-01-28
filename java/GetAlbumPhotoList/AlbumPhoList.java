package tbclient.GetAlbumPhotoList;

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
    super(paramBuilder);
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
  
  public AlbumPhoList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlbumPhoList> {
    public String album_id;
    
    public String big_pic;
    
    public String picture_id;
    
    public String small_pic;
    
    public Builder() {}
    
    public Builder(AlbumPhoList param1AlbumPhoList) {
      super(param1AlbumPhoList);
      if (param1AlbumPhoList == null)
        return; 
      this.picture_id = param1AlbumPhoList.picture_id;
      this.album_id = param1AlbumPhoList.album_id;
      this.small_pic = param1AlbumPhoList.small_pic;
      this.big_pic = param1AlbumPhoList.big_pic;
    }
    
    public AlbumPhoList build(boolean param1Boolean) {
      return new AlbumPhoList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
