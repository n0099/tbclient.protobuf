package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.OriForumInfo;

public final class BrandForumInfo extends Message {
  public static final String DEFAULT_BRAND_DESC = "";
  
  public static final String DEFAULT_JUMP_DESC = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final List<OriForumInfo> DEFAULT_RELATION_FORUM = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String brand_desc;
  
  @ProtoField(tag = 2)
  public final HeadImgs head_imgs;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String jump_desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<OriForumInfo> relation_forum;
  
  public BrandForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      List<OriForumInfo> list = paramBuilder.relation_forum;
      if (list == null) {
        this.relation_forum = DEFAULT_RELATION_FORUM;
      } else {
        this.relation_forum = Message.immutableCopyOf(list);
      } 
      this.head_imgs = paramBuilder.head_imgs;
      String str1 = paramBuilder.brand_desc;
      if (str1 == null) {
        this.brand_desc = "";
      } else {
        this.brand_desc = str1;
      } 
      str1 = paramBuilder.jump_url;
      if (str1 == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str1;
      } 
      str = paramBuilder.jump_desc;
      if (str == null) {
        this.jump_desc = "";
      } else {
        this.jump_desc = str;
      } 
    } else {
      this.relation_forum = Message.immutableCopyOf(((Builder)str).relation_forum);
      this.head_imgs = ((Builder)str).head_imgs;
      this.brand_desc = ((Builder)str).brand_desc;
      this.jump_url = ((Builder)str).jump_url;
      this.jump_desc = ((Builder)str).jump_desc;
    } 
  }
  
  public BrandForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BrandForumInfo> {
    public String brand_desc;
    
    public HeadImgs head_imgs;
    
    public String jump_desc;
    
    public String jump_url;
    
    public List<OriForumInfo> relation_forum;
    
    public Builder() {}
    
    public Builder(BrandForumInfo param1BrandForumInfo) {
      super(param1BrandForumInfo);
      if (param1BrandForumInfo == null)
        return; 
      this.relation_forum = Message.copyOf(param1BrandForumInfo.relation_forum);
      this.head_imgs = param1BrandForumInfo.head_imgs;
      this.brand_desc = param1BrandForumInfo.brand_desc;
      this.jump_url = param1BrandForumInfo.jump_url;
      this.jump_desc = param1BrandForumInfo.jump_desc;
    }
    
    public BrandForumInfo build(boolean param1Boolean) {
      return new BrandForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
