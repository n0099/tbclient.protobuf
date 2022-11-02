package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Post extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ADD_POST_NUMBER;
    public static final List<String> DEFAULT_ARR_VIDEO;
    public static final Long DEFAULT_AUTHOR_ID;
    public static final String DEFAULT_BIMG_URL = "";
    public static final List<CardLinkInfo> DEFAULT_CARD_LINK_INFO;
    public static final List<PbContent> DEFAULT_CONTENT;
    public static final String DEFAULT_DYNAMIC_URL = "";
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
    public static final String DEFAULT_RUMOR_SOURCE_IMG = "";
    public static final Integer DEFAULT_SHOW_SQUARED;
    public static final Integer DEFAULT_STORECOUNT;
    public static final Integer DEFAULT_SUB_POST_NUMBER;
    public static final Long DEFAULT_TID;
    public static final Integer DEFAULT_TIME;
    public static final String DEFAULT_TIME_EX = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_VOTE_CRYPT = "";
    public transient /* synthetic */ FieldHolder $fh;
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
    @ProtoField(tag = 64)
    public final ThemeBubble bubble_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 59)
    public final List<CardLinkInfo> card_link_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<PbContent> content;
    @ProtoField(tag = 60)
    public final CustomFigure custom_figure;
    @ProtoField(tag = 61)
    public final CustomState custom_state;
    @ProtoField(tag = 63, type = Message.Datatype.STRING)
    public final String dynamic_url;
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
    @ProtoField(tag = 62)
    public final FullLengthNovel full_length_novel;
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
    @ProtoField(tag = 65, type = Message.Datatype.STRING)
    public final String rumor_source_img;
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

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Post> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ActPost act_post;
        public AddPostList add_post_list;
        public Integer add_post_number;
        public Advertisement advertisement;
        public Agree agree;
        public List<String> arr_video;
        public User author;
        public Long author_id;
        public String bimg_url;
        public ThemeBubble bubble_info;
        public List<CardLinkInfo> card_link_info;
        public List<PbContent> content;
        public CustomFigure custom_figure;
        public CustomState custom_state;
        public String dynamic_url;
        public List<TailInfo> ext_tails;
        public Integer floor;
        public String fold_comment_apply_url;
        public Integer fold_comment_status;
        public String fold_tip;
        public SimpleForum from_forum;
        public FullLengthNovel full_length_novel;
        public TogetherHi high_together;
        public Long id;
        public Integer img_num_abtest;
        public String ios_bimg_format;
        public Integer is_bjh;
        public Integer is_bub;
        public Integer is_fold;
        public Integer is_hot_post;
        public Integer is_ntitle;
        public Integer is_post_visible;
        public Integer is_top_agree_post;
        public Integer is_voice;
        public Integer is_vote;
        public Integer is_wonderful_post;
        public Item item;
        public List<HeadItem> item_star;
        public Lbs lbs_info;
        public String lego_card;
        public Integer need_log;
        public NovelInfo novel_info;
        public OriginThreadInfo origin_thread_info;
        public Item outer_item;
        public DealInfo pb_deal_info;
        public PbPostZan post_zan;
        public PbPresent present;
        public String quote_id;
        public String rumor_source_img;
        public Integer show_squared;
        public SignatureData signature;
        public SkinInfo skin_info;
        public Integer storecount;
        public SubPost sub_post_list;
        public Integer sub_post_number;
        public TailInfo tail_info;
        public Long tid;
        public Integer time;
        public String time_ex;
        public String title;
        public TPointPost tpoint_post;
        public VideoInfo video_info;
        public String vote_crypt;
        public Zan zan;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(Post post) {
            super(post);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {post};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (post == null) {
                return;
            }
            this.id = post.id;
            this.title = post.title;
            this.floor = post.floor;
            this.time = post.time;
            this.content = Message.copyOf(post.content);
            this.arr_video = Message.copyOf(post.arr_video);
            this.lbs_info = post.lbs_info;
            this.is_vote = post.is_vote;
            this.is_voice = post.is_voice;
            this.is_ntitle = post.is_ntitle;
            this.is_bub = post.is_bub;
            this.vote_crypt = post.vote_crypt;
            this.sub_post_number = post.sub_post_number;
            this.time_ex = post.time_ex;
            this.sub_post_list = post.sub_post_list;
            this.add_post_list = post.add_post_list;
            this.bimg_url = post.bimg_url;
            this.ios_bimg_format = post.ios_bimg_format;
            this.author_id = post.author_id;
            this.add_post_number = post.add_post_number;
            this.signature = post.signature;
            this.tail_info = post.tail_info;
            this.author = post.author;
            this.zan = post.zan;
            this.storecount = post.storecount;
            this.tpoint_post = post.tpoint_post;
            this.act_post = post.act_post;
            this.present = post.present;
            this.video_info = post.video_info;
            this.post_zan = post.post_zan;
            this.is_hot_post = post.is_hot_post;
            this.ext_tails = Message.copyOf(post.ext_tails);
            this.high_together = post.high_together;
            this.skin_info = post.skin_info;
            this.pb_deal_info = post.pb_deal_info;
            this.lego_card = post.lego_card;
            this.agree = post.agree;
            this.from_forum = post.from_forum;
            this.is_post_visible = post.is_post_visible;
            this.need_log = post.need_log;
            this.img_num_abtest = post.img_num_abtest;
            this.origin_thread_info = post.origin_thread_info;
            this.is_fold = post.is_fold;
            this.fold_tip = post.fold_tip;
            this.is_top_agree_post = post.is_top_agree_post;
            this.tid = post.tid;
            this.show_squared = post.show_squared;
            this.is_bjh = post.is_bjh;
            this.quote_id = post.quote_id;
            this.is_wonderful_post = post.is_wonderful_post;
            this.item_star = Message.copyOf(post.item_star);
            this.item = post.item;
            this.outer_item = post.outer_item;
            this.advertisement = post.advertisement;
            this.fold_comment_status = post.fold_comment_status;
            this.fold_comment_apply_url = post.fold_comment_apply_url;
            this.novel_info = post.novel_info;
            this.card_link_info = Message.copyOf(post.card_link_info);
            this.custom_figure = post.custom_figure;
            this.custom_state = post.custom_state;
            this.full_length_novel = post.full_length_novel;
            this.dynamic_url = post.dynamic_url;
            this.bubble_info = post.bubble_info;
            this.rumor_source_img = post.rumor_source_img;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Post build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Post(this, z, null);
            }
            return (Post) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1090755343, "Ltbclient/Post;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1090755343, "Ltbclient/Post;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_FLOOR = 0;
        DEFAULT_TIME = 0;
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_ARR_VIDEO = Collections.emptyList();
        DEFAULT_IS_VOTE = 0;
        DEFAULT_IS_VOICE = 0;
        DEFAULT_IS_NTITLE = 0;
        DEFAULT_IS_BUB = 0;
        DEFAULT_SUB_POST_NUMBER = 0;
        DEFAULT_AUTHOR_ID = 0L;
        DEFAULT_ADD_POST_NUMBER = 0;
        DEFAULT_STORECOUNT = 0;
        DEFAULT_IS_HOT_POST = 0;
        DEFAULT_EXT_TAILS = Collections.emptyList();
        DEFAULT_IS_POST_VISIBLE = 0;
        DEFAULT_NEED_LOG = 0;
        DEFAULT_IMG_NUM_ABTEST = 0;
        DEFAULT_IS_FOLD = 0;
        DEFAULT_IS_TOP_AGREE_POST = 0;
        DEFAULT_TID = 0L;
        DEFAULT_SHOW_SQUARED = 0;
        DEFAULT_IS_BJH = 0;
        DEFAULT_IS_WONDERFUL_POST = 0;
        DEFAULT_ITEM_STAR = Collections.emptyList();
        DEFAULT_FOLD_COMMENT_STATUS = 0;
        DEFAULT_CARD_LINK_INFO = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Post(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.floor;
            if (num == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num;
            }
            Integer num2 = builder.time;
            if (num2 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num2;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            List<String> list2 = builder.arr_video;
            if (list2 == null) {
                this.arr_video = DEFAULT_ARR_VIDEO;
            } else {
                this.arr_video = Message.immutableCopyOf(list2);
            }
            this.lbs_info = builder.lbs_info;
            Integer num3 = builder.is_vote;
            if (num3 == null) {
                this.is_vote = DEFAULT_IS_VOTE;
            } else {
                this.is_vote = num3;
            }
            Integer num4 = builder.is_voice;
            if (num4 == null) {
                this.is_voice = DEFAULT_IS_VOICE;
            } else {
                this.is_voice = num4;
            }
            Integer num5 = builder.is_ntitle;
            if (num5 == null) {
                this.is_ntitle = DEFAULT_IS_NTITLE;
            } else {
                this.is_ntitle = num5;
            }
            Integer num6 = builder.is_bub;
            if (num6 == null) {
                this.is_bub = DEFAULT_IS_BUB;
            } else {
                this.is_bub = num6;
            }
            String str2 = builder.vote_crypt;
            if (str2 == null) {
                this.vote_crypt = "";
            } else {
                this.vote_crypt = str2;
            }
            Integer num7 = builder.sub_post_number;
            if (num7 == null) {
                this.sub_post_number = DEFAULT_SUB_POST_NUMBER;
            } else {
                this.sub_post_number = num7;
            }
            String str3 = builder.time_ex;
            if (str3 == null) {
                this.time_ex = "";
            } else {
                this.time_ex = str3;
            }
            this.sub_post_list = builder.sub_post_list;
            this.add_post_list = builder.add_post_list;
            String str4 = builder.bimg_url;
            if (str4 == null) {
                this.bimg_url = "";
            } else {
                this.bimg_url = str4;
            }
            String str5 = builder.ios_bimg_format;
            if (str5 == null) {
                this.ios_bimg_format = "";
            } else {
                this.ios_bimg_format = str5;
            }
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l2;
            }
            Integer num8 = builder.add_post_number;
            if (num8 == null) {
                this.add_post_number = DEFAULT_ADD_POST_NUMBER;
            } else {
                this.add_post_number = num8;
            }
            this.signature = builder.signature;
            this.tail_info = builder.tail_info;
            this.author = builder.author;
            this.zan = builder.zan;
            Integer num9 = builder.storecount;
            if (num9 == null) {
                this.storecount = DEFAULT_STORECOUNT;
            } else {
                this.storecount = num9;
            }
            this.tpoint_post = builder.tpoint_post;
            this.act_post = builder.act_post;
            this.present = builder.present;
            this.video_info = builder.video_info;
            this.post_zan = builder.post_zan;
            Integer num10 = builder.is_hot_post;
            if (num10 == null) {
                this.is_hot_post = DEFAULT_IS_HOT_POST;
            } else {
                this.is_hot_post = num10;
            }
            List<TailInfo> list3 = builder.ext_tails;
            if (list3 == null) {
                this.ext_tails = DEFAULT_EXT_TAILS;
            } else {
                this.ext_tails = Message.immutableCopyOf(list3);
            }
            this.high_together = builder.high_together;
            this.skin_info = builder.skin_info;
            this.pb_deal_info = builder.pb_deal_info;
            String str6 = builder.lego_card;
            if (str6 == null) {
                this.lego_card = "";
            } else {
                this.lego_card = str6;
            }
            this.agree = builder.agree;
            this.from_forum = builder.from_forum;
            Integer num11 = builder.is_post_visible;
            if (num11 == null) {
                this.is_post_visible = DEFAULT_IS_POST_VISIBLE;
            } else {
                this.is_post_visible = num11;
            }
            Integer num12 = builder.need_log;
            if (num12 == null) {
                this.need_log = DEFAULT_NEED_LOG;
            } else {
                this.need_log = num12;
            }
            Integer num13 = builder.img_num_abtest;
            if (num13 == null) {
                this.img_num_abtest = DEFAULT_IMG_NUM_ABTEST;
            } else {
                this.img_num_abtest = num13;
            }
            this.origin_thread_info = builder.origin_thread_info;
            Integer num14 = builder.is_fold;
            if (num14 == null) {
                this.is_fold = DEFAULT_IS_FOLD;
            } else {
                this.is_fold = num14;
            }
            String str7 = builder.fold_tip;
            if (str7 == null) {
                this.fold_tip = "";
            } else {
                this.fold_tip = str7;
            }
            Integer num15 = builder.is_top_agree_post;
            if (num15 == null) {
                this.is_top_agree_post = DEFAULT_IS_TOP_AGREE_POST;
            } else {
                this.is_top_agree_post = num15;
            }
            Long l3 = builder.tid;
            if (l3 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l3;
            }
            Integer num16 = builder.show_squared;
            if (num16 == null) {
                this.show_squared = DEFAULT_SHOW_SQUARED;
            } else {
                this.show_squared = num16;
            }
            Integer num17 = builder.is_bjh;
            if (num17 == null) {
                this.is_bjh = DEFAULT_IS_BJH;
            } else {
                this.is_bjh = num17;
            }
            String str8 = builder.quote_id;
            if (str8 == null) {
                this.quote_id = "";
            } else {
                this.quote_id = str8;
            }
            Integer num18 = builder.is_wonderful_post;
            if (num18 == null) {
                this.is_wonderful_post = DEFAULT_IS_WONDERFUL_POST;
            } else {
                this.is_wonderful_post = num18;
            }
            List<HeadItem> list4 = builder.item_star;
            if (list4 == null) {
                this.item_star = DEFAULT_ITEM_STAR;
            } else {
                this.item_star = Message.immutableCopyOf(list4);
            }
            this.item = builder.item;
            this.outer_item = builder.outer_item;
            this.advertisement = builder.advertisement;
            Integer num19 = builder.fold_comment_status;
            if (num19 == null) {
                this.fold_comment_status = DEFAULT_FOLD_COMMENT_STATUS;
            } else {
                this.fold_comment_status = num19;
            }
            String str9 = builder.fold_comment_apply_url;
            if (str9 == null) {
                this.fold_comment_apply_url = "";
            } else {
                this.fold_comment_apply_url = str9;
            }
            this.novel_info = builder.novel_info;
            List<CardLinkInfo> list5 = builder.card_link_info;
            if (list5 == null) {
                this.card_link_info = DEFAULT_CARD_LINK_INFO;
            } else {
                this.card_link_info = Message.immutableCopyOf(list5);
            }
            this.custom_figure = builder.custom_figure;
            this.custom_state = builder.custom_state;
            this.full_length_novel = builder.full_length_novel;
            String str10 = builder.dynamic_url;
            if (str10 == null) {
                this.dynamic_url = "";
            } else {
                this.dynamic_url = str10;
            }
            this.bubble_info = builder.bubble_info;
            String str11 = builder.rumor_source_img;
            if (str11 == null) {
                this.rumor_source_img = "";
                return;
            } else {
                this.rumor_source_img = str11;
                return;
            }
        }
        this.id = builder.id;
        this.title = builder.title;
        this.floor = builder.floor;
        this.time = builder.time;
        this.content = Message.immutableCopyOf(builder.content);
        this.arr_video = Message.immutableCopyOf(builder.arr_video);
        this.lbs_info = builder.lbs_info;
        this.is_vote = builder.is_vote;
        this.is_voice = builder.is_voice;
        this.is_ntitle = builder.is_ntitle;
        this.is_bub = builder.is_bub;
        this.vote_crypt = builder.vote_crypt;
        this.sub_post_number = builder.sub_post_number;
        this.time_ex = builder.time_ex;
        this.sub_post_list = builder.sub_post_list;
        this.add_post_list = builder.add_post_list;
        this.bimg_url = builder.bimg_url;
        this.ios_bimg_format = builder.ios_bimg_format;
        this.author_id = builder.author_id;
        this.add_post_number = builder.add_post_number;
        this.signature = builder.signature;
        this.tail_info = builder.tail_info;
        this.author = builder.author;
        this.zan = builder.zan;
        this.storecount = builder.storecount;
        this.tpoint_post = builder.tpoint_post;
        this.act_post = builder.act_post;
        this.present = builder.present;
        this.video_info = builder.video_info;
        this.post_zan = builder.post_zan;
        this.is_hot_post = builder.is_hot_post;
        this.ext_tails = Message.immutableCopyOf(builder.ext_tails);
        this.high_together = builder.high_together;
        this.skin_info = builder.skin_info;
        this.pb_deal_info = builder.pb_deal_info;
        this.lego_card = builder.lego_card;
        this.agree = builder.agree;
        this.from_forum = builder.from_forum;
        this.is_post_visible = builder.is_post_visible;
        this.need_log = builder.need_log;
        this.img_num_abtest = builder.img_num_abtest;
        this.origin_thread_info = builder.origin_thread_info;
        this.is_fold = builder.is_fold;
        this.fold_tip = builder.fold_tip;
        this.is_top_agree_post = builder.is_top_agree_post;
        this.tid = builder.tid;
        this.show_squared = builder.show_squared;
        this.is_bjh = builder.is_bjh;
        this.quote_id = builder.quote_id;
        this.is_wonderful_post = builder.is_wonderful_post;
        this.item_star = Message.immutableCopyOf(builder.item_star);
        this.item = builder.item;
        this.outer_item = builder.outer_item;
        this.advertisement = builder.advertisement;
        this.fold_comment_status = builder.fold_comment_status;
        this.fold_comment_apply_url = builder.fold_comment_apply_url;
        this.novel_info = builder.novel_info;
        this.card_link_info = Message.immutableCopyOf(builder.card_link_info);
        this.custom_figure = builder.custom_figure;
        this.custom_state = builder.custom_state;
        this.full_length_novel = builder.full_length_novel;
        this.dynamic_url = builder.dynamic_url;
        this.bubble_info = builder.bubble_info;
        this.rumor_source_img = builder.rumor_source_img;
    }

    public /* synthetic */ Post(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
