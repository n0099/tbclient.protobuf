package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PrivateForumInfo;
import tbclient.PrivatePopInfo;

public final class PrivateForumTotalInfo extends Message {
  public static final Integer DEFAULT_PRIVATE_FORUM_TASKPERCENT = Integer.valueOf(0);
  
  @ProtoField(tag = 5)
  public final HeadImgs head_imgs;
  
  @ProtoField(tag = 3)
  public final PrivateForumInfo private_forum_info;
  
  @ProtoField(tag = 2)
  public final PrivatePopInfo private_forum_popinfo;
  
  @ProtoField(tag = 1)
  public final PrivateForumShareinfo private_forum_shareinfo;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer private_forum_taskpercent;
  
  public PrivateForumTotalInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.private_forum_shareinfo = paramBuilder.private_forum_shareinfo;
      this.private_forum_popinfo = paramBuilder.private_forum_popinfo;
      this.private_forum_info = paramBuilder.private_forum_info;
      Integer integer = paramBuilder.private_forum_taskpercent;
      if (integer == null) {
        this.private_forum_taskpercent = DEFAULT_PRIVATE_FORUM_TASKPERCENT;
      } else {
        this.private_forum_taskpercent = integer;
      } 
      this.head_imgs = paramBuilder.head_imgs;
    } else {
      this.private_forum_shareinfo = paramBuilder.private_forum_shareinfo;
      this.private_forum_popinfo = paramBuilder.private_forum_popinfo;
      this.private_forum_info = paramBuilder.private_forum_info;
      this.private_forum_taskpercent = paramBuilder.private_forum_taskpercent;
      this.head_imgs = paramBuilder.head_imgs;
    } 
  }
  
  public PrivateForumTotalInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PrivateForumTotalInfo> {
    public HeadImgs head_imgs;
    
    public PrivateForumInfo private_forum_info;
    
    public PrivatePopInfo private_forum_popinfo;
    
    public PrivateForumShareinfo private_forum_shareinfo;
    
    public Integer private_forum_taskpercent;
    
    public Builder() {}
    
    public Builder(PrivateForumTotalInfo param1PrivateForumTotalInfo) {
      super(param1PrivateForumTotalInfo);
      if (param1PrivateForumTotalInfo == null)
        return; 
      this.private_forum_shareinfo = param1PrivateForumTotalInfo.private_forum_shareinfo;
      this.private_forum_popinfo = param1PrivateForumTotalInfo.private_forum_popinfo;
      this.private_forum_info = param1PrivateForumTotalInfo.private_forum_info;
      this.private_forum_taskpercent = param1PrivateForumTotalInfo.private_forum_taskpercent;
      this.head_imgs = param1PrivateForumTotalInfo.head_imgs;
    }
    
    public PrivateForumTotalInfo build(boolean param1Boolean) {
      return new PrivateForumTotalInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
