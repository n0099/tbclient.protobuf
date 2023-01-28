package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class PresentCategoryList extends Message {
  public static final Integer DEFAULT_CATEGORY_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_CATEGORY_NAME = "";
  
  public static final List<Integer> DEFAULT_GIFT_IDS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer category_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String category_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT32)
  public final List<Integer> gift_ids;
  
  public PresentCategoryList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Integer> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.category_id;
      if (integer == null) {
        this.category_id = DEFAULT_CATEGORY_ID;
      } else {
        this.category_id = integer;
      } 
      String str = paramBuilder.category_name;
      if (str == null) {
        this.category_name = "";
      } else {
        this.category_name = str;
      } 
      list = paramBuilder.gift_ids;
      if (list == null) {
        this.gift_ids = DEFAULT_GIFT_IDS;
      } else {
        this.gift_ids = Message.immutableCopyOf(list);
      } 
    } else {
      this.category_id = ((Builder)list).category_id;
      this.category_name = ((Builder)list).category_name;
      this.gift_ids = Message.immutableCopyOf(((Builder)list).gift_ids);
    } 
  }
  
  public PresentCategoryList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PresentCategoryList> {
    public Integer category_id;
    
    public String category_name;
    
    public List<Integer> gift_ids;
    
    public Builder() {}
    
    public Builder(PresentCategoryList param1PresentCategoryList) {
      super(param1PresentCategoryList);
      if (param1PresentCategoryList == null)
        return; 
      this.category_id = param1PresentCategoryList.category_id;
      this.category_name = param1PresentCategoryList.category_name;
      this.gift_ids = Message.copyOf(param1PresentCategoryList.gift_ids);
    }
    
    public PresentCategoryList build(boolean param1Boolean) {
      return new PresentCategoryList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
