package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PrivSets extends Message {
  public static final Integer DEFAULT_BAZHU_SHOW_INSIDE;
  
  public static final Integer DEFAULT_BAZHU_SHOW_OUTSIDE;
  
  public static final Integer DEFAULT_FRIEND;
  
  public static final Integer DEFAULT_GROUP;
  
  public static final Integer DEFAULT_LIKE;
  
  public static final Integer DEFAULT_LIVE;
  
  public static final Integer DEFAULT_LOCATION;
  
  public static final Integer DEFAULT_POST;
  
  public static final Integer DEFAULT_REPLY;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer bazhu_show_inside;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer bazhu_show_outside;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer friend;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer group;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer like;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer live;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer location;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer post;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer reply;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_LOCATION = integer;
    DEFAULT_LIKE = integer;
    DEFAULT_GROUP = integer;
    DEFAULT_POST = integer;
    DEFAULT_FRIEND = integer;
    DEFAULT_LIVE = integer;
    DEFAULT_REPLY = integer;
    DEFAULT_BAZHU_SHOW_INSIDE = integer;
    DEFAULT_BAZHU_SHOW_OUTSIDE = integer;
  }
  
  public PrivSets(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.location;
      if (integer1 == null) {
        this.location = DEFAULT_LOCATION;
      } else {
        this.location = integer1;
      } 
      integer1 = paramBuilder.like;
      if (integer1 == null) {
        this.like = DEFAULT_LIKE;
      } else {
        this.like = integer1;
      } 
      integer1 = paramBuilder.group;
      if (integer1 == null) {
        this.group = DEFAULT_GROUP;
      } else {
        this.group = integer1;
      } 
      integer1 = paramBuilder.post;
      if (integer1 == null) {
        this.post = DEFAULT_POST;
      } else {
        this.post = integer1;
      } 
      integer1 = paramBuilder.friend;
      if (integer1 == null) {
        this.friend = DEFAULT_FRIEND;
      } else {
        this.friend = integer1;
      } 
      integer1 = paramBuilder.live;
      if (integer1 == null) {
        this.live = DEFAULT_LIVE;
      } else {
        this.live = integer1;
      } 
      integer1 = paramBuilder.reply;
      if (integer1 == null) {
        this.reply = DEFAULT_REPLY;
      } else {
        this.reply = integer1;
      } 
      integer1 = paramBuilder.bazhu_show_inside;
      if (integer1 == null) {
        this.bazhu_show_inside = DEFAULT_BAZHU_SHOW_INSIDE;
      } else {
        this.bazhu_show_inside = integer1;
      } 
      integer = paramBuilder.bazhu_show_outside;
      if (integer == null) {
        this.bazhu_show_outside = DEFAULT_BAZHU_SHOW_OUTSIDE;
      } else {
        this.bazhu_show_outside = integer;
      } 
    } else {
      this.location = ((Builder)integer).location;
      this.like = ((Builder)integer).like;
      this.group = ((Builder)integer).group;
      this.post = ((Builder)integer).post;
      this.friend = ((Builder)integer).friend;
      this.live = ((Builder)integer).live;
      this.reply = ((Builder)integer).reply;
      this.bazhu_show_inside = ((Builder)integer).bazhu_show_inside;
      this.bazhu_show_outside = ((Builder)integer).bazhu_show_outside;
    } 
  }
  
  public PrivSets(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PrivSets> {
    public Integer bazhu_show_inside;
    
    public Integer bazhu_show_outside;
    
    public Integer friend;
    
    public Integer group;
    
    public Integer like;
    
    public Integer live;
    
    public Integer location;
    
    public Integer post;
    
    public Integer reply;
    
    public Builder() {}
    
    public Builder(PrivSets param1PrivSets) {
      super(param1PrivSets);
      if (param1PrivSets == null)
        return; 
      this.location = param1PrivSets.location;
      this.like = param1PrivSets.like;
      this.group = param1PrivSets.group;
      this.post = param1PrivSets.post;
      this.friend = param1PrivSets.friend;
      this.live = param1PrivSets.live;
      this.reply = param1PrivSets.reply;
      this.bazhu_show_inside = param1PrivSets.bazhu_show_inside;
      this.bazhu_show_outside = param1PrivSets.bazhu_show_outside;
    }
    
    public PrivSets build(boolean param1Boolean) {
      return new PrivSets(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
