package tbclient.FriendFeedPage;

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
import tbclient.Abstract;
import tbclient.AnchorInfo;
import tbclient.Anti;
import tbclient.Media;
import tbclient.MediaNum;
import tbclient.User;
import tbclient.Voice;
import tbclient.Zan;
/* loaded from: classes3.dex */
public final class FriendThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<Abstract> DEFAULT_ABSTRACT;
    public static final Long DEFAULT_AUTHOR_ID;
    public static final Long DEFAULT_FID;
    public static final Long DEFAULT_FIRST_POST_ID;
    public static final String DEFAULT_FNAME = "";
    public static final Long DEFAULT_ID;
    public static final Integer DEFAULT_IS_GOOD;
    public static final Integer DEFAULT_IS_LIVEPOST;
    public static final Integer DEFAULT_IS_MEMBERTOP;
    public static final Integer DEFAULT_IS_NTITLE;
    public static final Integer DEFAULT_IS_TOP;
    public static final Integer DEFAULT_IS_VOICE_THREAD;
    public static final Integer DEFAULT_LAST_TIME_INT;
    public static final List<Media> DEFAULT_MEDIA;
    public static final List<MediaNum> DEFAULT_MEDIA_NUM;
    public static final Integer DEFAULT_REPLY_NUM;
    public static final Long DEFAULT_THREAD_TYPE;
    public static final Long DEFAULT_TID;
    public static final String DEFAULT_TIMELINE = "";
    public static final String DEFAULT_TITLE = "";
    public static final List<Voice> DEFAULT_VOICE_INFO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 23)
    public final AnchorInfo anchor_info;
    @ProtoField(tag = 20)
    public final Anti anti;
    @ProtoField(tag = 11)
    public final User author;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 21, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 18, type = Message.Datatype.INT64)
    public final Long first_post_id;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_good;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_livepost;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_membertop;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_ntitle;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_top;
    @ProtoField(tag = 24, type = Message.Datatype.INT32)
    public final Integer is_voice_thread;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer last_time_int;
    @ProtoField(label = Message.Label.REPEATED, tag = 15)
    public final List<Media> media;
    @ProtoField(label = Message.Label.REPEATED, tag = 16)
    public final List<MediaNum> media_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(tag = 25, type = Message.Datatype.UINT64)
    public final Long thread_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String timeline;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(label = Message.Label.REPEATED, tag = 17)
    public final List<Voice> voice_info;
    @ProtoField(tag = 19)
    public final Zan zan;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<FriendThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Abstract> _abstract;
        public AnchorInfo anchor_info;
        public Anti anti;
        public User author;
        public Long author_id;
        public Long fid;
        public Long first_post_id;
        public String fname;
        public Long id;
        public Integer is_good;
        public Integer is_livepost;
        public Integer is_membertop;
        public Integer is_ntitle;
        public Integer is_top;
        public Integer is_voice_thread;
        public Integer last_time_int;
        public List<Media> media;
        public List<MediaNum> media_num;
        public Integer reply_num;
        public Long thread_type;
        public Long tid;
        public String timeline;
        public String title;
        public List<Voice> voice_info;
        public Zan zan;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(FriendThreadInfo friendThreadInfo) {
            super(friendThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {friendThreadInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (friendThreadInfo == null) {
                return;
            }
            this.id = friendThreadInfo.id;
            this.tid = friendThreadInfo.tid;
            this.title = friendThreadInfo.title;
            this.reply_num = friendThreadInfo.reply_num;
            this.last_time_int = friendThreadInfo.last_time_int;
            this.is_top = friendThreadInfo.is_top;
            this.is_membertop = friendThreadInfo.is_membertop;
            this.is_good = friendThreadInfo.is_good;
            this.is_livepost = friendThreadInfo.is_livepost;
            this.author_id = friendThreadInfo.author_id;
            this.author = friendThreadInfo.author;
            this.is_ntitle = friendThreadInfo.is_ntitle;
            this.timeline = friendThreadInfo.timeline;
            this._abstract = Message.copyOf(friendThreadInfo._abstract);
            this.media = Message.copyOf(friendThreadInfo.media);
            this.media_num = Message.copyOf(friendThreadInfo.media_num);
            this.voice_info = Message.copyOf(friendThreadInfo.voice_info);
            this.first_post_id = friendThreadInfo.first_post_id;
            this.zan = friendThreadInfo.zan;
            this.anti = friendThreadInfo.anti;
            this.fid = friendThreadInfo.fid;
            this.fname = friendThreadInfo.fname;
            this.anchor_info = friendThreadInfo.anchor_info;
            this.is_voice_thread = friendThreadInfo.is_voice_thread;
            this.thread_type = friendThreadInfo.thread_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FriendThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FriendThreadInfo(this, z, null) : (FriendThreadInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(270462379, "Ltbclient/FriendFeedPage/FriendThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(270462379, "Ltbclient/FriendFeedPage/FriendThreadInfo;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_TID = 0L;
        DEFAULT_REPLY_NUM = 0;
        DEFAULT_LAST_TIME_INT = 0;
        DEFAULT_IS_TOP = 0;
        DEFAULT_IS_MEMBERTOP = 0;
        DEFAULT_IS_GOOD = 0;
        DEFAULT_IS_LIVEPOST = 0;
        DEFAULT_AUTHOR_ID = 0L;
        DEFAULT_IS_NTITLE = 0;
        DEFAULT_ABSTRACT = Collections.emptyList();
        DEFAULT_MEDIA = Collections.emptyList();
        DEFAULT_MEDIA_NUM = Collections.emptyList();
        DEFAULT_VOICE_INFO = Collections.emptyList();
        DEFAULT_FIRST_POST_ID = 0L;
        DEFAULT_FID = 0L;
        DEFAULT_IS_VOICE_THREAD = 0;
        DEFAULT_THREAD_TYPE = 0L;
    }

    public /* synthetic */ FriendThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendThreadInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
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
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.reply_num;
            if (num == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num;
            }
            Integer num2 = builder.last_time_int;
            if (num2 == null) {
                this.last_time_int = DEFAULT_LAST_TIME_INT;
            } else {
                this.last_time_int = num2;
            }
            Integer num3 = builder.is_top;
            if (num3 == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = num3;
            }
            Integer num4 = builder.is_membertop;
            if (num4 == null) {
                this.is_membertop = DEFAULT_IS_MEMBERTOP;
            } else {
                this.is_membertop = num4;
            }
            Integer num5 = builder.is_good;
            if (num5 == null) {
                this.is_good = DEFAULT_IS_GOOD;
            } else {
                this.is_good = num5;
            }
            Integer num6 = builder.is_livepost;
            if (num6 == null) {
                this.is_livepost = DEFAULT_IS_LIVEPOST;
            } else {
                this.is_livepost = num6;
            }
            Long l3 = builder.author_id;
            if (l3 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l3;
            }
            this.author = builder.author;
            Integer num7 = builder.is_ntitle;
            if (num7 == null) {
                this.is_ntitle = DEFAULT_IS_NTITLE;
            } else {
                this.is_ntitle = num7;
            }
            String str2 = builder.timeline;
            if (str2 == null) {
                this.timeline = "";
            } else {
                this.timeline = str2;
            }
            List<Abstract> list = builder._abstract;
            if (list == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list);
            }
            List<Media> list2 = builder.media;
            if (list2 == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list2);
            }
            List<MediaNum> list3 = builder.media_num;
            if (list3 == null) {
                this.media_num = DEFAULT_MEDIA_NUM;
            } else {
                this.media_num = Message.immutableCopyOf(list3);
            }
            List<Voice> list4 = builder.voice_info;
            if (list4 == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = Message.immutableCopyOf(list4);
            }
            Long l4 = builder.first_post_id;
            if (l4 == null) {
                this.first_post_id = DEFAULT_FIRST_POST_ID;
            } else {
                this.first_post_id = l4;
            }
            this.zan = builder.zan;
            this.anti = builder.anti;
            Long l5 = builder.fid;
            if (l5 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l5;
            }
            String str3 = builder.fname;
            if (str3 == null) {
                this.fname = "";
            } else {
                this.fname = str3;
            }
            this.anchor_info = builder.anchor_info;
            Integer num8 = builder.is_voice_thread;
            if (num8 == null) {
                this.is_voice_thread = DEFAULT_IS_VOICE_THREAD;
            } else {
                this.is_voice_thread = num8;
            }
            Long l6 = builder.thread_type;
            if (l6 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
                return;
            } else {
                this.thread_type = l6;
                return;
            }
        }
        this.id = builder.id;
        this.tid = builder.tid;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this.last_time_int = builder.last_time_int;
        this.is_top = builder.is_top;
        this.is_membertop = builder.is_membertop;
        this.is_good = builder.is_good;
        this.is_livepost = builder.is_livepost;
        this.author_id = builder.author_id;
        this.author = builder.author;
        this.is_ntitle = builder.is_ntitle;
        this.timeline = builder.timeline;
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.media = Message.immutableCopyOf(builder.media);
        this.media_num = Message.immutableCopyOf(builder.media_num);
        this.voice_info = Message.immutableCopyOf(builder.voice_info);
        this.first_post_id = builder.first_post_id;
        this.zan = builder.zan;
        this.anti = builder.anti;
        this.fid = builder.fid;
        this.fname = builder.fname;
        this.anchor_info = builder.anchor_info;
        this.is_voice_thread = builder.is_voice_thread;
        this.thread_type = builder.thread_type;
    }
}
