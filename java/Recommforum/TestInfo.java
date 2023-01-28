package tbclient.Recommforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TestInfo extends Message {
  public static final Integer DEFAULT_ANSWERED;
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final String DEFAULT_IMAGE_URL = "";
  
  public static final String DEFAULT_RESULT_IMG = "";
  
  public static final Long DEFAULT_TEST_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer answered;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer create_time;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image_url;
  
  @ProtoField(tag = 9)
  public final RecommForum recomm_forum;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String result_img;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long test_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_ANSWERED = integer;
  }
  
  public TestInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.test_id;
      if (long_ == null) {
        this.test_id = DEFAULT_TEST_ID;
      } else {
        this.test_id = long_;
      } 
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      str2 = paramBuilder.image_url;
      if (str2 == null) {
        this.image_url = "";
      } else {
        this.image_url = str2;
      } 
      Integer integer = paramBuilder.create_time;
      if (integer == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer;
      } 
      integer = paramBuilder.answered;
      if (integer == null) {
        this.answered = DEFAULT_ANSWERED;
      } else {
        this.answered = integer;
      } 
      String str1 = paramBuilder.result_img;
      if (str1 == null) {
        this.result_img = "";
      } else {
        this.result_img = str1;
      } 
      this.recomm_forum = paramBuilder.recomm_forum;
    } else {
      this.test_id = paramBuilder.test_id;
      this.title = paramBuilder.title;
      this.image_url = paramBuilder.image_url;
      this.create_time = paramBuilder.create_time;
      this.answered = paramBuilder.answered;
      this.result_img = paramBuilder.result_img;
      this.recomm_forum = paramBuilder.recomm_forum;
    } 
  }
  
  public TestInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TestInfo> {
    public Integer answered;
    
    public Integer create_time;
    
    public String image_url;
    
    public RecommForum recomm_forum;
    
    public String result_img;
    
    public Long test_id;
    
    public String title;
    
    public Builder() {}
    
    public Builder(TestInfo param1TestInfo) {
      super(param1TestInfo);
      if (param1TestInfo == null)
        return; 
      this.test_id = param1TestInfo.test_id;
      this.title = param1TestInfo.title;
      this.image_url = param1TestInfo.image_url;
      this.create_time = param1TestInfo.create_time;
      this.answered = param1TestInfo.answered;
      this.result_img = param1TestInfo.result_img;
      this.recomm_forum = param1TestInfo.recomm_forum;
    }
    
    public TestInfo build(boolean param1Boolean) {
      return new TestInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
