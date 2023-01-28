package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ChapterInfo extends Message {
  public static final Long DEFAULT_CHAPTER_ID;
  
  public static final Integer DEFAULT_CHAPTER_NO;
  
  public static final Integer DEFAULT_IS_BUY;
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final Integer DEFAULT_ORIGNAL_PRICE;
  
  public static final Integer DEFAULT_PAGES;
  
  public static final Integer DEFAULT_PAGE_ID;
  
  public static final List<Integer> DEFAULT_PARAGRAPHS;
  
  public static final Integer DEFAULT_PARAGRAPH_ID;
  
  public static final Integer DEFAULT_PRICE;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_WORDS;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long chapter_id;
  
  @ProtoField(tag = 12, type = Message.Datatype.UINT32)
  public final Integer chapter_no;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer is_buy;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer level;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer orignal_price;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer page_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer pages;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer paragraph_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.UINT32)
  public final List<Integer> paragraphs;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer words;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_CHAPTER_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_LEVEL = integer;
    DEFAULT_WORDS = integer;
    DEFAULT_PAGE_ID = integer;
    DEFAULT_PARAGRAPH_ID = integer;
    DEFAULT_PAGES = integer;
    DEFAULT_PARAGRAPHS = Collections.emptyList();
    DEFAULT_PRICE = integer;
    DEFAULT_IS_BUY = integer;
    DEFAULT_ORIGNAL_PRICE = integer;
    DEFAULT_CHAPTER_NO = integer;
    DEFAULT_THREAD_ID = long_;
  }
  
  public ChapterInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.chapter_id;
      if (long_1 == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = long_1;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      Integer integer2 = paramBuilder.level;
      if (integer2 == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer2;
      } 
      integer2 = paramBuilder.words;
      if (integer2 == null) {
        this.words = DEFAULT_WORDS;
      } else {
        this.words = integer2;
      } 
      integer2 = paramBuilder.page_id;
      if (integer2 == null) {
        this.page_id = DEFAULT_PAGE_ID;
      } else {
        this.page_id = integer2;
      } 
      integer2 = paramBuilder.paragraph_id;
      if (integer2 == null) {
        this.paragraph_id = DEFAULT_PARAGRAPH_ID;
      } else {
        this.paragraph_id = integer2;
      } 
      integer2 = paramBuilder.pages;
      if (integer2 == null) {
        this.pages = DEFAULT_PAGES;
      } else {
        this.pages = integer2;
      } 
      List<Integer> list = paramBuilder.paragraphs;
      if (list == null) {
        this.paragraphs = DEFAULT_PARAGRAPHS;
      } else {
        this.paragraphs = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.price;
      if (integer1 == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer1;
      } 
      integer1 = paramBuilder.is_buy;
      if (integer1 == null) {
        this.is_buy = DEFAULT_IS_BUY;
      } else {
        this.is_buy = integer1;
      } 
      integer1 = paramBuilder.orignal_price;
      if (integer1 == null) {
        this.orignal_price = DEFAULT_ORIGNAL_PRICE;
      } else {
        this.orignal_price = integer1;
      } 
      integer1 = paramBuilder.chapter_no;
      if (integer1 == null) {
        this.chapter_no = DEFAULT_CHAPTER_NO;
      } else {
        this.chapter_no = integer1;
      } 
      long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
    } else {
      this.chapter_id = ((Builder)long_).chapter_id;
      this.title = ((Builder)long_).title;
      this.level = ((Builder)long_).level;
      this.words = ((Builder)long_).words;
      this.page_id = ((Builder)long_).page_id;
      this.paragraph_id = ((Builder)long_).paragraph_id;
      this.pages = ((Builder)long_).pages;
      this.paragraphs = Message.immutableCopyOf(((Builder)long_).paragraphs);
      this.price = ((Builder)long_).price;
      this.is_buy = ((Builder)long_).is_buy;
      this.orignal_price = ((Builder)long_).orignal_price;
      this.chapter_no = ((Builder)long_).chapter_no;
      this.thread_id = ((Builder)long_).thread_id;
    } 
  }
  
  public ChapterInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ChapterInfo> {
    public Long chapter_id;
    
    public Integer chapter_no;
    
    public Integer is_buy;
    
    public Integer level;
    
    public Integer orignal_price;
    
    public Integer page_id;
    
    public Integer pages;
    
    public Integer paragraph_id;
    
    public List<Integer> paragraphs;
    
    public Integer price;
    
    public Long thread_id;
    
    public String title;
    
    public Integer words;
    
    public Builder() {}
    
    public Builder(ChapterInfo param1ChapterInfo) {
      super(param1ChapterInfo);
      if (param1ChapterInfo == null)
        return; 
      this.chapter_id = param1ChapterInfo.chapter_id;
      this.title = param1ChapterInfo.title;
      this.level = param1ChapterInfo.level;
      this.words = param1ChapterInfo.words;
      this.page_id = param1ChapterInfo.page_id;
      this.paragraph_id = param1ChapterInfo.paragraph_id;
      this.pages = param1ChapterInfo.pages;
      this.paragraphs = Message.copyOf(param1ChapterInfo.paragraphs);
      this.price = param1ChapterInfo.price;
      this.is_buy = param1ChapterInfo.is_buy;
      this.orignal_price = param1ChapterInfo.orignal_price;
      this.chapter_no = param1ChapterInfo.chapter_no;
      this.thread_id = param1ChapterInfo.thread_id;
    }
    
    public ChapterInfo build(boolean param1Boolean) {
      return new ChapterInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
