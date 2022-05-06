import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ActPost;
import tbclient.AddPostList;
import tbclient.Advertisement;
import tbclient.Agree;
import tbclient.DealInfo;
import tbclient.HeadItem;
import tbclient.Item;
import tbclient.Lbs;
import tbclient.NovelInfo;
import tbclient.OriginThreadInfo;
import tbclient.PbContent;
import tbclient.PbPostZan;
import tbclient.PbPresent;
import tbclient.Post;
import tbclient.SignatureData;
import tbclient.SimpleForum;
import tbclient.SkinInfo;
import tbclient.SubPost;
import tbclient.TPointPost;
import tbclient.TailInfo;
import tbclient.TogetherHi;
import tbclient.User;
import tbclient.VideoInfo;
import tbclient.Zan;

public final class Post extends Message {
  public static final Integer DEFAULT_ADD_POST_NUMBER;
  
  public static final List<String> DEFAULT_ARR_VIDEO;
  
  public static final Long DEFAULT_AUTHOR_ID;
  
  public static final String DEFAULT_BIMG_URL = "";
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final List<TailInfo> DEFAULT_EXT_TAILS;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final String DEFAULT_FOLD_COMMENT_APPLY_URL = "";
  
  public static final Integer DEFAULT_FOLD_COMMENT_STATUS;
  
  public static final String DEFAULT_FOLD_TIP = "";
  
  public static final Long DEFAULT_ID;
  
  public static final Integer DEFAULT_IMG_NUM_ABTEST;
  
  public static final String DEFAULT_IOS_BIMG_FORMAT = "";
  
  public static final Integer DEFAULT_IS_BJH;
  
  public static final Integer DEFAULT_IS_BUB;
  
  public static final Integer DEFAULT_IS_FOLD;
  
  public static final Integer DEFAULT_IS_HOT_POST;
  
  public static final Integer DEFAULT_IS_NTITLE;
  
  public static final Integer DEFAULT_IS_POST_VISIBLE;
  
  public static final Integer DEFAULT_IS_TOP_AGREE_POST;
  
  public static final Integer DEFAULT_IS_VOICE;
  
  public static final Integer DEFAULT_IS_VOTE;
  
  public static final Integer DEFAULT_IS_WONDERFUL_POST;
  
  public static final List<HeadItem> DEFAULT_ITEM_STAR;
  
  public static final String DEFAULT_LEGO_CARD = "";
  
  public static final Integer DEFAULT_NEED_LOG;
  
  public static final String DEFAULT_QUOTE_ID = "";
  
  public static final Integer DEFAULT_SHOW_SQUARED;
  
  public static final Integer DEFAULT_STORECOUNT;
  
  public static final Integer DEFAULT_SUB_POST_NUMBER;
  
  public static final Long DEFAULT_TID;
  
  public static final Integer DEFAULT_TIME;
  
  public static final String DEFAULT_TIME_EX = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_VOTE_CRYPT = "";
  
  @ProtoField(tag = 27)
  public final ActPost act_post;
  
  @ProtoField(tag = 16)
  public final AddPostList add_post_list;
  
  @ProtoField(tag = 20, type = Message.Datatype.UINT32)
  public final Integer add_post_number;
  
  @ProtoField(tag = 55)
  public final Advertisement advertisement;
  
  @ProtoField(tag = 37)
  public final Agree agree;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.STRING)
  public final List<String> arr_video;
  
  @ProtoField(tag = 23)
  public final User author;
  
  @ProtoField(tag = 19, type = Message.Datatype.INT64)
  public final Long author_id;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String bimg_url;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<PbContent> content;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 32)
  public final List<TailInfo> ext_tails;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(tag = 57, type = Message.Datatype.STRING)
  public final String fold_comment_apply_url;
  
  @ProtoField(tag = 56, type = Message.Datatype.INT32)
  public final Integer fold_comment_status;
  
  @ProtoField(tag = 44, type = Message.Datatype.STRING)
  public final String fold_tip;
  
  @ProtoField(tag = 38)
  public final SimpleForum from_forum;
  
  @ProtoField(tag = 33)
  public final TogetherHi high_together;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long id;
  
  @ProtoField(tag = 41, type = Message.Datatype.INT32)
  public final Integer img_num_abtest;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String ios_bimg_format;
  
  @ProtoField(tag = 48, type = Message.Datatype.INT32)
  public final Integer is_bjh;
  
  @ProtoField(tag = 11, type = Message.Datatype.UINT32)
  public final Integer is_bub;
  
  @ProtoField(tag = 43, type = Message.Datatype.INT32)
  public final Integer is_fold;
  
  @ProtoField(tag = 31, type = Message.Datatype.INT32)
  public final Integer is_hot_post;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer is_ntitle;
  
  @ProtoField(tag = 39, type = Message.Datatype.INT32)
  public final Integer is_post_visible;
  
  @ProtoField(tag = 45, type = Message.Datatype.INT32)
  public final Integer is_top_agree_post;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer is_voice;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer is_vote;
  
  @ProtoField(tag = 51, type = Message.Datatype.INT32)
  public final Integer is_wonderful_post;
  
  @ProtoField(tag = 53)
  public final Item item;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 52)
  public final List<HeadItem> item_star;
  
  @ProtoField(tag = 7)
  public final Lbs lbs_info;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String lego_card;
  
  @ProtoField(tag = 40, type = Message.Datatype.INT32)
  public final Integer need_log;
  
  @ProtoField(tag = 58)
  public final NovelInfo novel_info;
  
  @ProtoField(tag = 42)
  public final OriginThreadInfo origin_thread_info;
  
  @ProtoField(tag = 54)
  public final Item outer_item;
  
  @ProtoField(tag = 35)
  public final DealInfo pb_deal_info;
  
  @ProtoField(tag = 30)
  public final PbPostZan post_zan;
  
  @ProtoField(tag = 28)
  public final PbPresent present;
  
  @ProtoField(tag = 50, type = Message.Datatype.STRING)
  public final String quote_id;
  
  @ProtoField(tag = 47, type = Message.Datatype.INT32)
  public final Integer show_squared;
  
  @ProtoField(tag = 21)
  public final SignatureData signature;
  
  @ProtoField(tag = 34)
  public final SkinInfo skin_info;
  
  @ProtoField(tag = 25, type = Message.Datatype.INT32)
  public final Integer storecount;
  
  @ProtoField(tag = 15)
  public final SubPost sub_post_list;
  
  @ProtoField(tag = 13, type = Message.Datatype.UINT32)
  public final Integer sub_post_number;
  
  @ProtoField(tag = 22)
  public final TailInfo tail_info;
  
  @ProtoField(tag = 46, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String time_ex;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 26)
  public final TPointPost tpoint_post;
  
  @ProtoField(tag = 29)
  public final VideoInfo video_info;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String vote_crypt;
  
  @ProtoField(tag = 24)
  public final Zan zan;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1090755343, "Ltbclient/Post;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1090755343, "Ltbclient/Post;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_FLOOR = integer;
    DEFAULT_TIME = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_ARR_VIDEO = Collections.emptyList();
    DEFAULT_IS_VOTE = integer;
    DEFAULT_IS_VOICE = integer;
    DEFAULT_IS_NTITLE = integer;
    DEFAULT_IS_BUB = integer;
    DEFAULT_SUB_POST_NUMBER = integer;
    DEFAULT_AUTHOR_ID = long_;
    DEFAULT_ADD_POST_NUMBER = integer;
    DEFAULT_STORECOUNT = integer;
    DEFAULT_IS_HOT_POST = integer;
    DEFAULT_EXT_TAILS = Collections.emptyList();
    DEFAULT_IS_POST_VISIBLE = integer;
    DEFAULT_NEED_LOG = integer;
    DEFAULT_IMG_NUM_ABTEST = integer;
    DEFAULT_IS_FOLD = integer;
    DEFAULT_IS_TOP_AGREE_POST = integer;
    DEFAULT_TID = long_;
    DEFAULT_SHOW_SQUARED = integer;
    DEFAULT_IS_BJH = integer;
    DEFAULT_IS_WONDERFUL_POST = integer;
    DEFAULT_ITEM_STAR = Collections.emptyList();
    DEFAULT_FOLD_COMMENT_STATUS = integer;
  }
  
  public Post(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_3 = paramBuilder.id;
      if (long_3 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = long_3;
      } 
      String str7 = paramBuilder.title;
      if (str7 == null) {
        this.title = "";
      } else {
        this.title = str7;
      } 
      Integer integer9 = paramBuilder.floor;
      if (integer9 == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer9;
      } 
      integer9 = paramBuilder.time;
      if (integer9 == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer9;
      } 
      List list3 = paramBuilder.content;
      if (list3 == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list3);
      } 
      list3 = paramBuilder.arr_video;
      if (list3 == null) {
        this.arr_video = DEFAULT_ARR_VIDEO;
      } else {
        this.arr_video = Message.immutableCopyOf(list3);
      } 
      this.lbs_info = paramBuilder.lbs_info;
      Integer integer8 = paramBuilder.is_vote;
      if (integer8 == null) {
        this.is_vote = DEFAULT_IS_VOTE;
      } else {
        this.is_vote = integer8;
      } 
      integer8 = paramBuilder.is_voice;
      if (integer8 == null) {
        this.is_voice = DEFAULT_IS_VOICE;
      } else {
        this.is_voice = integer8;
      } 
      integer8 = paramBuilder.is_ntitle;
      if (integer8 == null) {
        this.is_ntitle = DEFAULT_IS_NTITLE;
      } else {
        this.is_ntitle = integer8;
      } 
      integer8 = paramBuilder.is_bub;
      if (integer8 == null) {
        this.is_bub = DEFAULT_IS_BUB;
      } else {
        this.is_bub = integer8;
      } 
      String str6 = paramBuilder.vote_crypt;
      if (str6 == null) {
        this.vote_crypt = "";
      } else {
        this.vote_crypt = str6;
      } 
      Integer integer7 = paramBuilder.sub_post_number;
      if (integer7 == null) {
        this.sub_post_number = DEFAULT_SUB_POST_NUMBER;
      } else {
        this.sub_post_number = integer7;
      } 
      String str5 = paramBuilder.time_ex;
      if (str5 == null) {
        this.time_ex = "";
      } else {
        this.time_ex = str5;
      } 
      this.sub_post_list = paramBuilder.sub_post_list;
      this.add_post_list = paramBuilder.add_post_list;
      str5 = paramBuilder.bimg_url;
      if (str5 == null) {
        this.bimg_url = "";
      } else {
        this.bimg_url = str5;
      } 
      str5 = paramBuilder.ios_bimg_format;
      if (str5 == null) {
        this.ios_bimg_format = "";
      } else {
        this.ios_bimg_format = str5;
      } 
      Long long_2 = paramBuilder.author_id;
      if (long_2 == null) {
        this.author_id = DEFAULT_AUTHOR_ID;
      } else {
        this.author_id = long_2;
      } 
      Integer integer6 = paramBuilder.add_post_number;
      if (integer6 == null) {
        this.add_post_number = DEFAULT_ADD_POST_NUMBER;
      } else {
        this.add_post_number = integer6;
      } 
      this.signature = paramBuilder.signature;
      this.tail_info = paramBuilder.tail_info;
      this.author = paramBuilder.author;
      this.zan = paramBuilder.zan;
      integer6 = paramBuilder.storecount;
      if (integer6 == null) {
        this.storecount = DEFAULT_STORECOUNT;
      } else {
        this.storecount = integer6;
      } 
      this.tpoint_post = paramBuilder.tpoint_post;
      this.act_post = paramBuilder.act_post;
      this.present = paramBuilder.present;
      this.video_info = paramBuilder.video_info;
      this.post_zan = paramBuilder.post_zan;
      integer6 = paramBuilder.is_hot_post;
      if (integer6 == null) {
        this.is_hot_post = DEFAULT_IS_HOT_POST;
      } else {
        this.is_hot_post = integer6;
      } 
      List list2 = paramBuilder.ext_tails;
      if (list2 == null) {
        this.ext_tails = DEFAULT_EXT_TAILS;
      } else {
        this.ext_tails = Message.immutableCopyOf(list2);
      } 
      this.high_together = paramBuilder.high_together;
      this.skin_info = paramBuilder.skin_info;
      this.pb_deal_info = paramBuilder.pb_deal_info;
      String str4 = paramBuilder.lego_card;
      if (str4 == null) {
        this.lego_card = "";
      } else {
        this.lego_card = str4;
      } 
      this.agree = paramBuilder.agree;
      this.from_forum = paramBuilder.from_forum;
      Integer integer5 = paramBuilder.is_post_visible;
      if (integer5 == null) {
        this.is_post_visible = DEFAULT_IS_POST_VISIBLE;
      } else {
        this.is_post_visible = integer5;
      } 
      integer5 = paramBuilder.need_log;
      if (integer5 == null) {
        this.need_log = DEFAULT_NEED_LOG;
      } else {
        this.need_log = integer5;
      } 
      integer5 = paramBuilder.img_num_abtest;
      if (integer5 == null) {
        this.img_num_abtest = DEFAULT_IMG_NUM_ABTEST;
      } else {
        this.img_num_abtest = integer5;
      } 
      this.origin_thread_info = paramBuilder.origin_thread_info;
      integer5 = paramBuilder.is_fold;
      if (integer5 == null) {
        this.is_fold = DEFAULT_IS_FOLD;
      } else {
        this.is_fold = integer5;
      } 
      String str3 = paramBuilder.fold_tip;
      if (str3 == null) {
        this.fold_tip = "";
      } else {
        this.fold_tip = str3;
      } 
      Integer integer4 = paramBuilder.is_top_agree_post;
      if (integer4 == null) {
        this.is_top_agree_post = DEFAULT_IS_TOP_AGREE_POST;
      } else {
        this.is_top_agree_post = integer4;
      } 
      Long long_1 = paramBuilder.tid;
      if (long_1 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_1;
      } 
      Integer integer3 = paramBuilder.show_squared;
      if (integer3 == null) {
        this.show_squared = DEFAULT_SHOW_SQUARED;
      } else {
        this.show_squared = integer3;
      } 
      integer3 = paramBuilder.is_bjh;
      if (integer3 == null) {
        this.is_bjh = DEFAULT_IS_BJH;
      } else {
        this.is_bjh = integer3;
      } 
      String str2 = paramBuilder.quote_id;
      if (str2 == null) {
        this.quote_id = "";
      } else {
        this.quote_id = str2;
      } 
      Integer integer2 = paramBuilder.is_wonderful_post;
      if (integer2 == null) {
        this.is_wonderful_post = DEFAULT_IS_WONDERFUL_POST;
      } else {
        this.is_wonderful_post = integer2;
      } 
      List list1 = paramBuilder.item_star;
      if (list1 == null) {
        this.item_star = DEFAULT_ITEM_STAR;
      } else {
        this.item_star = Message.immutableCopyOf(list1);
      } 
      this.item = paramBuilder.item;
      this.outer_item = paramBuilder.outer_item;
      this.advertisement = paramBuilder.advertisement;
      Integer integer1 = paramBuilder.fold_comment_status;
      if (integer1 == null) {
        this.fold_comment_status = DEFAULT_FOLD_COMMENT_STATUS;
      } else {
        this.fold_comment_status = integer1;
      } 
      String str1 = paramBuilder.fold_comment_apply_url;
      if (str1 == null) {
        this.fold_comment_apply_url = "";
      } else {
        this.fold_comment_apply_url = str1;
      } 
      this.novel_info = paramBuilder.novel_info;
    } else {
      this.id = paramBuilder.id;
      this.title = paramBuilder.title;
      this.floor = paramBuilder.floor;
      this.time = paramBuilder.time;
      this.content = Message.immutableCopyOf(paramBuilder.content);
      this.arr_video = Message.immutableCopyOf(paramBuilder.arr_video);
      this.lbs_info = paramBuilder.lbs_info;
      this.is_vote = paramBuilder.is_vote;
      this.is_voice = paramBuilder.is_voice;
      this.is_ntitle = paramBuilder.is_ntitle;
      this.is_bub = paramBuilder.is_bub;
      this.vote_crypt = paramBuilder.vote_crypt;
      this.sub_post_number = paramBuilder.sub_post_number;
      this.time_ex = paramBuilder.time_ex;
      this.sub_post_list = paramBuilder.sub_post_list;
      this.add_post_list = paramBuilder.add_post_list;
      this.bimg_url = paramBuilder.bimg_url;
      this.ios_bimg_format = paramBuilder.ios_bimg_format;
      this.author_id = paramBuilder.author_id;
      this.add_post_number = paramBuilder.add_post_number;
      this.signature = paramBuilder.signature;
      this.tail_info = paramBuilder.tail_info;
      this.author = paramBuilder.author;
      this.zan = paramBuilder.zan;
      this.storecount = paramBuilder.storecount;
      this.tpoint_post = paramBuilder.tpoint_post;
      this.act_post = paramBuilder.act_post;
      this.present = paramBuilder.present;
      this.video_info = paramBuilder.video_info;
      this.post_zan = paramBuilder.post_zan;
      this.is_hot_post = paramBuilder.is_hot_post;
      this.ext_tails = Message.immutableCopyOf(paramBuilder.ext_tails);
      this.high_together = paramBuilder.high_together;
      this.skin_info = paramBuilder.skin_info;
      this.pb_deal_info = paramBuilder.pb_deal_info;
      this.lego_card = paramBuilder.lego_card;
      this.agree = paramBuilder.agree;
      this.from_forum = paramBuilder.from_forum;
      this.is_post_visible = paramBuilder.is_post_visible;
      this.need_log = paramBuilder.need_log;
      this.img_num_abtest = paramBuilder.img_num_abtest;
      this.origin_thread_info = paramBuilder.origin_thread_info;
      this.is_fold = paramBuilder.is_fold;
      this.fold_tip = paramBuilder.fold_tip;
      this.is_top_agree_post = paramBuilder.is_top_agree_post;
      this.tid = paramBuilder.tid;
      this.show_squared = paramBuilder.show_squared;
      this.is_bjh = paramBuilder.is_bjh;
      this.quote_id = paramBuilder.quote_id;
      this.is_wonderful_post = paramBuilder.is_wonderful_post;
      this.item_star = Message.immutableCopyOf(paramBuilder.item_star);
      this.item = paramBuilder.item;
      this.outer_item = paramBuilder.outer_item;
      this.advertisement = paramBuilder.advertisement;
      this.fold_comment_status = paramBuilder.fold_comment_status;
      this.fold_comment_apply_url = paramBuilder.fold_comment_apply_url;
      this.novel_info = paramBuilder.novel_info;
    } 
  }
}
