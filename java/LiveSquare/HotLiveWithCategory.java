package tbclient.LiveSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class HotLiveWithCategory extends Message {
  public static final String DEFAULT_BITMAP_WH_RATIO = "";
  
  public static final Integer DEFAULT_ENTRY_ID;
  
  public static final String DEFAULT_ENTRY_NAME = "";
  
  public static final String DEFAULT_LABEL_NAME = "";
  
  public static final List<ThreadInfo> DEFAULT_LIVE = Collections.emptyList();
  
  public static final Integer DEFAULT_LIVE_TAB_TYPE;
  
  public static final List<String> DEFAULT_SUB_TYPE_LIST;
  
  public static final Integer DEFAULT_TAB_ID;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bitmap_wh_ratio;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer entry_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String entry_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String label_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ThreadInfo> live;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer live_tab_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> sub_type_list;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  static {
    DEFAULT_LIVE_TAB_TYPE = integer;
    DEFAULT_TAB_ID = integer;
    DEFAULT_SUB_TYPE_LIST = Collections.emptyList();
  }
  
  public HotLiveWithCategory(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str3 = paramBuilder.entry_name;
      if (str3 == null) {
        this.entry_name = "";
      } else {
        this.entry_name = str3;
      } 
      Integer integer2 = paramBuilder.entry_id;
      if (integer2 == null) {
        this.entry_id = DEFAULT_ENTRY_ID;
      } else {
        this.entry_id = integer2;
      } 
      String str2 = paramBuilder.bitmap_wh_ratio;
      if (str2 == null) {
        this.bitmap_wh_ratio = "";
      } else {
        this.bitmap_wh_ratio = str2;
      } 
      List<ThreadInfo> list1 = paramBuilder.live;
      if (list1 == null) {
        this.live = DEFAULT_LIVE;
      } else {
        this.live = Message.immutableCopyOf(list1);
      } 
      String str1 = paramBuilder.label_name;
      if (str1 == null) {
        this.label_name = "";
      } else {
        this.label_name = str1;
      } 
      Integer integer1 = paramBuilder.live_tab_type;
      if (integer1 == null) {
        this.live_tab_type = DEFAULT_LIVE_TAB_TYPE;
      } else {
        this.live_tab_type = integer1;
      } 
      integer1 = paramBuilder.tab_id;
      if (integer1 == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer1;
      } 
      list = paramBuilder.sub_type_list;
      if (list == null) {
        this.sub_type_list = DEFAULT_SUB_TYPE_LIST;
      } else {
        this.sub_type_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.entry_name = ((Builder)list).entry_name;
      this.entry_id = ((Builder)list).entry_id;
      this.bitmap_wh_ratio = ((Builder)list).bitmap_wh_ratio;
      this.live = Message.immutableCopyOf(((Builder)list).live);
      this.label_name = ((Builder)list).label_name;
      this.live_tab_type = ((Builder)list).live_tab_type;
      this.tab_id = ((Builder)list).tab_id;
      this.sub_type_list = Message.immutableCopyOf(((Builder)list).sub_type_list);
    } 
  }
  
  public HotLiveWithCategory(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_ENTRY_ID = integer;
  }
  
  public static final class Builder extends Message.Builder<HotLiveWithCategory> {
    public String bitmap_wh_ratio;
    
    public Integer entry_id;
    
    public String entry_name;
    
    public String label_name;
    
    public List<ThreadInfo> live;
    
    public Integer live_tab_type;
    
    public List<String> sub_type_list;
    
    public Integer tab_id;
    
    public Builder() {}
    
    public Builder(HotLiveWithCategory param1HotLiveWithCategory) {
      super(param1HotLiveWithCategory);
      if (param1HotLiveWithCategory == null)
        return; 
      this.entry_name = param1HotLiveWithCategory.entry_name;
      this.entry_id = param1HotLiveWithCategory.entry_id;
      this.bitmap_wh_ratio = param1HotLiveWithCategory.bitmap_wh_ratio;
      this.live = Message.copyOf(param1HotLiveWithCategory.live);
      this.label_name = param1HotLiveWithCategory.label_name;
      this.live_tab_type = param1HotLiveWithCategory.live_tab_type;
      this.tab_id = param1HotLiveWithCategory.tab_id;
      this.sub_type_list = Message.copyOf(param1HotLiveWithCategory.sub_type_list);
    }
    
    public HotLiveWithCategory build(boolean param1Boolean) {
      return new HotLiveWithCategory(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
