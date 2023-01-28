package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlbumElement extends Message {
  public static final Integer DEFAULT_ALBUM_HEIGHT;
  
  public static final String DEFAULT_ALBUM_THUMB_URL = "";
  
  public static final Integer DEFAULT_ALBUM_TYPE;
  
  public static final String DEFAULT_ALBUM_URL = "";
  
  public static final Integer DEFAULT_ALBUM_WIDTH;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer album_height;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String album_thumb_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer album_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String album_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer album_width;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ALBUM_TYPE = integer;
    DEFAULT_ALBUM_HEIGHT = integer;
    DEFAULT_ALBUM_WIDTH = integer;
  }
  
  public AlbumElement(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.album_type;
      if (integer2 == null) {
        this.album_type = DEFAULT_ALBUM_TYPE;
      } else {
        this.album_type = integer2;
      } 
      String str = paramBuilder.album_url;
      if (str == null) {
        this.album_url = "";
      } else {
        this.album_url = str;
      } 
      str = paramBuilder.album_thumb_url;
      if (str == null) {
        this.album_thumb_url = "";
      } else {
        this.album_thumb_url = str;
      } 
      Integer integer1 = paramBuilder.album_height;
      if (integer1 == null) {
        this.album_height = DEFAULT_ALBUM_HEIGHT;
      } else {
        this.album_height = integer1;
      } 
      integer = paramBuilder.album_width;
      if (integer == null) {
        this.album_width = DEFAULT_ALBUM_WIDTH;
      } else {
        this.album_width = integer;
      } 
    } else {
      this.album_type = ((Builder)integer).album_type;
      this.album_url = ((Builder)integer).album_url;
      this.album_thumb_url = ((Builder)integer).album_thumb_url;
      this.album_height = ((Builder)integer).album_height;
      this.album_width = ((Builder)integer).album_width;
    } 
  }
  
  public AlbumElement(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlbumElement> {
    public Integer album_height;
    
    public String album_thumb_url;
    
    public Integer album_type;
    
    public String album_url;
    
    public Integer album_width;
    
    public Builder() {}
    
    public Builder(AlbumElement param1AlbumElement) {
      super(param1AlbumElement);
      if (param1AlbumElement == null)
        return; 
      this.album_type = param1AlbumElement.album_type;
      this.album_url = param1AlbumElement.album_url;
      this.album_thumb_url = param1AlbumElement.album_thumb_url;
      this.album_height = param1AlbumElement.album_height;
      this.album_width = param1AlbumElement.album_width;
    }
    
    public AlbumElement build(boolean param1Boolean) {
      return new AlbumElement(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
