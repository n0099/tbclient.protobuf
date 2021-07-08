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
public final class OriginThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<Abstract> DEFAULT_ABSTRACT;
    public static final List<PbContent> DEFAULT_CONTENT;
    public static final Long DEFAULT_FID;
    public static final String DEFAULT_FNAME = "";
    public static final Integer DEFAULT_IS_DELETED;
    public static final Integer DEFAULT_IS_NEW_STYLE;
    public static final Integer DEFAULT_IS_UGC;
    public static final List<HeadItem> DEFAULT_ITEM_STAR;
    public static final List<Media> DEFAULT_MEDIA;
    public static final Integer DEFAULT_REPLY_NUM;
    public static final Integer DEFAULT_SHARED_NUM;
    public static final Integer DEFAULT_THREAD_TYPE;
    public static final String DEFAULT_TID = "";
    public static final String DEFAULT_TITLE = "";
    public static final List<Voice> DEFAULT_VOICE_INFO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 19)
    public final Agree agree;
    @ProtoField(tag = 6)
    public final AlaLiveInfo ala_info;
    @ProtoField(tag = 18)
    public final User author;
    @ProtoField(label = Message.Label.REPEATED, tag = 14)
    public final List<PbContent> content;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fname;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_deleted;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer is_new_style;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_ugc;
    @ProtoField(tag = 22)
    public final Item item;
    @ProtoField(label = Message.Label.REPEATED, tag = 23)
    public final List<HeadItem> item_star;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<Media> media;
    @ProtoField(tag = 11)
    public final Baijiahao ori_ugc_info;
    @ProtoField(tag = 21)
    public final PollInfo poll_info;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer reply_num;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer shared_num;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tid;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 13)
    public final VideoInfo video_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 12)
    public final List<Voice> voice_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<OriginThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Abstract> _abstract;
        public Agree agree;
        public AlaLiveInfo ala_info;
        public User author;
        public List<PbContent> content;
        public Long fid;
        public String fname;
        public Integer is_deleted;
        public Integer is_new_style;
        public Integer is_ugc;
        public Item item;
        public List<HeadItem> item_star;
        public List<Media> media;
        public Baijiahao ori_ugc_info;
        public PollInfo poll_info;
        public Integer reply_num;
        public Integer shared_num;
        public Integer thread_type;
        public String tid;
        public String title;
        public VideoInfo video_info;
        public List<Voice> voice_info;

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
        public Builder(OriginThreadInfo originThreadInfo) {
            super(originThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {originThreadInfo};
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
            if (originThreadInfo == null) {
                return;
            }
            this.title = originThreadInfo.title;
            this.media = Message.copyOf(originThreadInfo.media);
            this._abstract = Message.copyOf(originThreadInfo._abstract);
            this.fname = originThreadInfo.fname;
            this.tid = originThreadInfo.tid;
            this.ala_info = originThreadInfo.ala_info;
            this.fid = originThreadInfo.fid;
            this.thread_type = originThreadInfo.thread_type;
            this.is_deleted = originThreadInfo.is_deleted;
            this.is_ugc = originThreadInfo.is_ugc;
            this.ori_ugc_info = originThreadInfo.ori_ugc_info;
            this.voice_info = Message.copyOf(originThreadInfo.voice_info);
            this.video_info = originThreadInfo.video_info;
            this.content = Message.copyOf(originThreadInfo.content);
            this.is_new_style = originThreadInfo.is_new_style;
            this.reply_num = originThreadInfo.reply_num;
            this.author = originThreadInfo.author;
            this.agree = originThreadInfo.agree;
            this.shared_num = originThreadInfo.shared_num;
            this.poll_info = originThreadInfo.poll_info;
            this.item = originThreadInfo.item;
            this.item_star = Message.copyOf(originThreadInfo.item_star);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OriginThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new OriginThreadInfo(this, z, null) : (OriginThreadInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(893396659, "Ltbclient/OriginThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(893396659, "Ltbclient/OriginThreadInfo;");
                return;
            }
        }
        DEFAULT_MEDIA = Collections.emptyList();
        DEFAULT_ABSTRACT = Collections.emptyList();
        DEFAULT_FID = 0L;
        DEFAULT_THREAD_TYPE = 0;
        DEFAULT_IS_DELETED = 0;
        DEFAULT_IS_UGC = 0;
        DEFAULT_VOICE_INFO = Collections.emptyList();
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_IS_NEW_STYLE = 0;
        DEFAULT_REPLY_NUM = 0;
        DEFAULT_SHARED_NUM = 0;
        DEFAULT_ITEM_STAR = Collections.emptyList();
    }

    public /* synthetic */ OriginThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OriginThreadInfo(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list);
            }
            List<Abstract> list2 = builder._abstract;
            if (list2 == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list2);
            }
            String str2 = builder.fname;
            if (str2 == null) {
                this.fname = "";
            } else {
                this.fname = str2;
            }
            String str3 = builder.tid;
            if (str3 == null) {
                this.tid = "";
            } else {
                this.tid = str3;
            }
            this.ala_info = builder.ala_info;
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            Integer num = builder.thread_type;
            if (num == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num;
            }
            Integer num2 = builder.is_deleted;
            if (num2 == null) {
                this.is_deleted = DEFAULT_IS_DELETED;
            } else {
                this.is_deleted = num2;
            }
            Integer num3 = builder.is_ugc;
            if (num3 == null) {
                this.is_ugc = DEFAULT_IS_UGC;
            } else {
                this.is_ugc = num3;
            }
            this.ori_ugc_info = builder.ori_ugc_info;
            List<Voice> list3 = builder.voice_info;
            if (list3 == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = Message.immutableCopyOf(list3);
            }
            this.video_info = builder.video_info;
            List<PbContent> list4 = builder.content;
            if (list4 == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list4);
            }
            Integer num4 = builder.is_new_style;
            if (num4 == null) {
                this.is_new_style = DEFAULT_IS_NEW_STYLE;
            } else {
                this.is_new_style = num4;
            }
            Integer num5 = builder.reply_num;
            if (num5 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = num5;
            }
            this.author = builder.author;
            this.agree = builder.agree;
            Integer num6 = builder.shared_num;
            if (num6 == null) {
                this.shared_num = DEFAULT_SHARED_NUM;
            } else {
                this.shared_num = num6;
            }
            this.poll_info = builder.poll_info;
            this.item = builder.item;
            List<HeadItem> list5 = builder.item_star;
            if (list5 == null) {
                this.item_star = DEFAULT_ITEM_STAR;
                return;
            } else {
                this.item_star = Message.immutableCopyOf(list5);
                return;
            }
        }
        this.title = builder.title;
        this.media = Message.immutableCopyOf(builder.media);
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.fname = builder.fname;
        this.tid = builder.tid;
        this.ala_info = builder.ala_info;
        this.fid = builder.fid;
        this.thread_type = builder.thread_type;
        this.is_deleted = builder.is_deleted;
        this.is_ugc = builder.is_ugc;
        this.ori_ugc_info = builder.ori_ugc_info;
        this.voice_info = Message.immutableCopyOf(builder.voice_info);
        this.video_info = builder.video_info;
        this.content = Message.immutableCopyOf(builder.content);
        this.is_new_style = builder.is_new_style;
        this.reply_num = builder.reply_num;
        this.author = builder.author;
        this.agree = builder.agree;
        this.shared_num = builder.shared_num;
        this.poll_info = builder.poll_info;
        this.item = builder.item;
        this.item_star = Message.immutableCopyOf(builder.item_star);
    }
}
