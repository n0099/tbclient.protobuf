package tbclient.ReplyMe;

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
import tbclient.Baijiahao;
import tbclient.NewFloorInfo;
import tbclient.OriginThreadInfo;
import tbclient.User;
import tbclient.Zan;
/* loaded from: classes8.dex */
public final class ReplyList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FNAME = "";
    public static final Integer DEFAULT_HAS_AGREE;
    public static final Integer DEFAULT_HIDE_FNAME;
    public static final Integer DEFAULT_IS_BJH;
    public static final Integer DEFAULT_IS_FLOOR;
    public static final Integer DEFAULT_IS_SHARE_THREAD;
    public static final Integer DEFAULT_IS_STORY;
    public static final String DEFAULT_ITEM_TYPE = "";
    public static final List<NewFloorInfo> DEFAULT_NEW_FLOOR_INFO;
    public static final String DEFAULT_POST_FROM = "";
    public static final Long DEFAULT_POST_ID;
    public static final String DEFAULT_QUOTE_CONTENT = "";
    public static final Long DEFAULT_QUOTE_PID;
    public static final Integer DEFAULT_SERVER_TIME;
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_THREAD_IMG_URL = "";
    public static final Integer DEFAULT_THREAD_TYPE;
    public static final Integer DEFAULT_TIME;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public static final Integer DEFAULT_UNREAD;
    public static final Long DEFAULT_V_FORUM_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 27)
    public final Baijiahao baijiahao;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer has_agree;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer hide_fname;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer is_bjh;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer is_floor;
    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer is_share_thread;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_story;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String item_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 28)
    public final List<NewFloorInfo> new_floor_info;
    @ProtoField(tag = 21)
    public final OriginThreadInfo origin_thread_info;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String post_from;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String quote_content;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long quote_pid;
    @ProtoField(tag = 15)
    public final User quote_user;
    @ProtoField(tag = 9)
    public final User replyer;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer server_time;
    @ProtoField(tag = 25)
    public final User thread_author_user;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String thread_img_url;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer thread_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer unread;
    @ProtoField(tag = 18, type = Message.Datatype.UINT64)
    public final Long v_forum_id;
    @ProtoField(tag = 13)
    public final Zan zan;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReplyList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Baijiahao baijiahao;
        public String content;
        public String fname;
        public Integer has_agree;
        public Integer hide_fname;
        public Integer is_bjh;
        public Integer is_floor;
        public Integer is_share_thread;
        public Integer is_story;
        public String item_type;
        public List<NewFloorInfo> new_floor_info;
        public OriginThreadInfo origin_thread_info;
        public String post_from;
        public Long post_id;
        public String quote_content;
        public Long quote_pid;
        public User quote_user;
        public User replyer;
        public Integer server_time;
        public User thread_author_user;
        public Long thread_id;
        public String thread_img_url;
        public Integer thread_type;
        public Integer time;
        public String title;
        public Integer type;
        public Integer unread;
        public Long v_forum_id;
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
        public Builder(ReplyList replyList) {
            super(replyList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {replyList};
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
            if (replyList == null) {
                return;
            }
            this.thread_id = replyList.thread_id;
            this.post_id = replyList.post_id;
            this.time = replyList.time;
            this.title = replyList.title;
            this.fname = replyList.fname;
            this.content = replyList.content;
            this.is_floor = replyList.is_floor;
            this.quote_content = replyList.quote_content;
            this.replyer = replyList.replyer;
            this.type = replyList.type;
            this.unread = replyList.unread;
            this.item_type = replyList.item_type;
            this.zan = replyList.zan;
            this.quote_pid = replyList.quote_pid;
            this.quote_user = replyList.quote_user;
            this.server_time = replyList.server_time;
            this.thread_type = replyList.thread_type;
            this.v_forum_id = replyList.v_forum_id;
            this.hide_fname = replyList.hide_fname;
            this.is_story = replyList.is_story;
            this.origin_thread_info = replyList.origin_thread_info;
            this.post_from = replyList.post_from;
            this.is_share_thread = replyList.is_share_thread;
            this.thread_img_url = replyList.thread_img_url;
            this.thread_author_user = replyList.thread_author_user;
            this.is_bjh = replyList.is_bjh;
            this.baijiahao = replyList.baijiahao;
            this.new_floor_info = Message.copyOf(replyList.new_floor_info);
            this.has_agree = replyList.has_agree;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReplyList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ReplyList(this, z, null) : (ReplyList) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-751210710, "Ltbclient/ReplyMe/ReplyList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-751210710, "Ltbclient/ReplyMe/ReplyList;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_POST_ID = 0L;
        DEFAULT_TIME = 0;
        DEFAULT_IS_FLOOR = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_UNREAD = 0;
        DEFAULT_QUOTE_PID = 0L;
        DEFAULT_SERVER_TIME = 0;
        DEFAULT_THREAD_TYPE = 0;
        DEFAULT_V_FORUM_ID = 0L;
        DEFAULT_HIDE_FNAME = 0;
        DEFAULT_IS_STORY = 0;
        DEFAULT_IS_SHARE_THREAD = 0;
        DEFAULT_IS_BJH = 0;
        DEFAULT_NEW_FLOOR_INFO = Collections.emptyList();
        DEFAULT_HAS_AGREE = 0;
    }

    public /* synthetic */ ReplyList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplyList(Builder builder, boolean z) {
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
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.post_id;
            if (l2 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l2;
            }
            Integer num = builder.time;
            if (num == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.fname;
            if (str2 == null) {
                this.fname = "";
            } else {
                this.fname = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            Integer num2 = builder.is_floor;
            if (num2 == null) {
                this.is_floor = DEFAULT_IS_FLOOR;
            } else {
                this.is_floor = num2;
            }
            String str4 = builder.quote_content;
            if (str4 == null) {
                this.quote_content = "";
            } else {
                this.quote_content = str4;
            }
            this.replyer = builder.replyer;
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            Integer num4 = builder.unread;
            if (num4 == null) {
                this.unread = DEFAULT_UNREAD;
            } else {
                this.unread = num4;
            }
            String str5 = builder.item_type;
            if (str5 == null) {
                this.item_type = "";
            } else {
                this.item_type = str5;
            }
            this.zan = builder.zan;
            Long l3 = builder.quote_pid;
            if (l3 == null) {
                this.quote_pid = DEFAULT_QUOTE_PID;
            } else {
                this.quote_pid = l3;
            }
            this.quote_user = builder.quote_user;
            Integer num5 = builder.server_time;
            if (num5 == null) {
                this.server_time = DEFAULT_SERVER_TIME;
            } else {
                this.server_time = num5;
            }
            Integer num6 = builder.thread_type;
            if (num6 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num6;
            }
            Long l4 = builder.v_forum_id;
            if (l4 == null) {
                this.v_forum_id = DEFAULT_V_FORUM_ID;
            } else {
                this.v_forum_id = l4;
            }
            Integer num7 = builder.hide_fname;
            if (num7 == null) {
                this.hide_fname = DEFAULT_HIDE_FNAME;
            } else {
                this.hide_fname = num7;
            }
            Integer num8 = builder.is_story;
            if (num8 == null) {
                this.is_story = DEFAULT_IS_STORY;
            } else {
                this.is_story = num8;
            }
            this.origin_thread_info = builder.origin_thread_info;
            String str6 = builder.post_from;
            if (str6 == null) {
                this.post_from = "";
            } else {
                this.post_from = str6;
            }
            Integer num9 = builder.is_share_thread;
            if (num9 == null) {
                this.is_share_thread = DEFAULT_IS_SHARE_THREAD;
            } else {
                this.is_share_thread = num9;
            }
            String str7 = builder.thread_img_url;
            if (str7 == null) {
                this.thread_img_url = "";
            } else {
                this.thread_img_url = str7;
            }
            this.thread_author_user = builder.thread_author_user;
            Integer num10 = builder.is_bjh;
            if (num10 == null) {
                this.is_bjh = DEFAULT_IS_BJH;
            } else {
                this.is_bjh = num10;
            }
            this.baijiahao = builder.baijiahao;
            List<NewFloorInfo> list = builder.new_floor_info;
            if (list == null) {
                this.new_floor_info = DEFAULT_NEW_FLOOR_INFO;
            } else {
                this.new_floor_info = Message.immutableCopyOf(list);
            }
            Integer num11 = builder.has_agree;
            if (num11 == null) {
                this.has_agree = DEFAULT_HAS_AGREE;
                return;
            } else {
                this.has_agree = num11;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.time = builder.time;
        this.title = builder.title;
        this.fname = builder.fname;
        this.content = builder.content;
        this.is_floor = builder.is_floor;
        this.quote_content = builder.quote_content;
        this.replyer = builder.replyer;
        this.type = builder.type;
        this.unread = builder.unread;
        this.item_type = builder.item_type;
        this.zan = builder.zan;
        this.quote_pid = builder.quote_pid;
        this.quote_user = builder.quote_user;
        this.server_time = builder.server_time;
        this.thread_type = builder.thread_type;
        this.v_forum_id = builder.v_forum_id;
        this.hide_fname = builder.hide_fname;
        this.is_story = builder.is_story;
        this.origin_thread_info = builder.origin_thread_info;
        this.post_from = builder.post_from;
        this.is_share_thread = builder.is_share_thread;
        this.thread_img_url = builder.thread_img_url;
        this.thread_author_user = builder.thread_author_user;
        this.is_bjh = builder.is_bjh;
        this.baijiahao = builder.baijiahao;
        this.new_floor_info = Message.immutableCopyOf(builder.new_floor_info);
        this.has_agree = builder.has_agree;
    }
}
