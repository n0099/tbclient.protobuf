package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VoteSchema extends Message {
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_TEXT_AFTER_VOTE = "";
  
  public static final String DEFAULT_TEXT_BEFORE_VOTE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text_after_vote;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text_before_vote;
  
  public VoteSchema(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.text_before_vote;
      if (str1 == null) {
        this.text_before_vote = "";
      } else {
        this.text_before_vote = str1;
      } 
      str1 = paramBuilder.text_after_vote;
      if (str1 == null) {
        this.text_after_vote = "";
      } else {
        this.text_after_vote = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.text_before_vote = ((Builder)str).text_before_vote;
      this.text_after_vote = ((Builder)str).text_after_vote;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public VoteSchema(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VoteSchema> {
    public String jump_url;
    
    public String text_after_vote;
    
    public String text_before_vote;
    
    public Builder() {}
    
    public Builder(VoteSchema param1VoteSchema) {
      super(param1VoteSchema);
      if (param1VoteSchema == null)
        return; 
      this.text_before_vote = param1VoteSchema.text_before_vote;
      this.text_after_vote = param1VoteSchema.text_after_vote;
      this.jump_url = param1VoteSchema.jump_url;
    }
    
    public VoteSchema build(boolean param1Boolean) {
      return new VoteSchema(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
