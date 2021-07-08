package tbclient.ExcFrsPage;

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
import tbclient.ZhiBoInfoTW;
/* loaded from: classes9.dex */
public final class ExcellentThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_ABTEST = "";
    public static final Long DEFAULT_EXCID;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_FRS_TYPE;
    public static final String DEFAULT_LEGO_CARD = "";
    public static final Integer DEFAULT_PB_TYPE;
    public static final Long DEFAULT_POST_NUM;
    public static final Integer DEFAULT_PUBLISH_TIME;
    public static final Long DEFAULT_RANK;
    public static final Integer DEFAULT_SOURCE;
    public static final Long DEFAULT_TAG_CODE;
    public static final String DEFAULT_TAG_NAME = "";
    public static final Long DEFAULT_THREAD_ID;
    public static final Integer DEFAULT_THREAD_TYPE;
    public static final List<String> DEFAULT_THUMBNAIL;
    public static final String DEFAULT_TITLE = "";
    public static final Long DEFAULT_ZANSUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String abtest;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long excid;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer frs_type;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String lego_card;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer pb_type;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 18, type = Message.Datatype.UINT64)
    public final Long rank;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer source;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long tag_code;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> thumbnail;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 13)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = 10, type = Message.Datatype.UINT64)
    public final Long zansum;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ExcellentThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public String abtest;
        public Long excid;
        public Long forum_id;
        public String forum_name;
        public Integer frs_type;
        public String lego_card;
        public Integer pb_type;
        public Long post_num;
        public Integer publish_time;
        public Long rank;
        public Integer source;
        public Long tag_code;
        public String tag_name;
        public Long thread_id;
        public Integer thread_type;
        public List<String> thumbnail;
        public String title;
        public ZhiBoInfoTW twzhibo_info;
        public Long zansum;

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
        public Builder(ExcellentThreadInfo excellentThreadInfo) {
            super(excellentThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {excellentThreadInfo};
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
            if (excellentThreadInfo == null) {
                return;
            }
            this.excid = excellentThreadInfo.excid;
            this.thread_id = excellentThreadInfo.thread_id;
            this.frs_type = excellentThreadInfo.frs_type;
            this.pb_type = excellentThreadInfo.pb_type;
            this.title = excellentThreadInfo.title;
            this._abstract = excellentThreadInfo._abstract;
            this.thumbnail = Message.copyOf(excellentThreadInfo.thumbnail);
            this.tag_code = excellentThreadInfo.tag_code;
            this.tag_name = excellentThreadInfo.tag_name;
            this.zansum = excellentThreadInfo.zansum;
            this.post_num = excellentThreadInfo.post_num;
            this.thread_type = excellentThreadInfo.thread_type;
            this.twzhibo_info = excellentThreadInfo.twzhibo_info;
            this.forum_id = excellentThreadInfo.forum_id;
            this.forum_name = excellentThreadInfo.forum_name;
            this.abtest = excellentThreadInfo.abtest;
            this.source = excellentThreadInfo.source;
            this.rank = excellentThreadInfo.rank;
            this.publish_time = excellentThreadInfo.publish_time;
            this.lego_card = excellentThreadInfo.lego_card;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ExcellentThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ExcellentThreadInfo(this, z, null) : (ExcellentThreadInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2038358924, "Ltbclient/ExcFrsPage/ExcellentThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2038358924, "Ltbclient/ExcFrsPage/ExcellentThreadInfo;");
                return;
            }
        }
        DEFAULT_EXCID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_FRS_TYPE = 0;
        DEFAULT_PB_TYPE = 0;
        DEFAULT_THUMBNAIL = Collections.emptyList();
        DEFAULT_TAG_CODE = 0L;
        DEFAULT_ZANSUM = 0L;
        DEFAULT_POST_NUM = 0L;
        DEFAULT_THREAD_TYPE = 0;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_SOURCE = 0;
        DEFAULT_RANK = 0L;
        DEFAULT_PUBLISH_TIME = 0;
    }

    public /* synthetic */ ExcellentThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExcellentThreadInfo(Builder builder, boolean z) {
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
            Long l = builder.excid;
            if (l == null) {
                this.excid = DEFAULT_EXCID;
            } else {
                this.excid = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Integer num = builder.frs_type;
            if (num == null) {
                this.frs_type = DEFAULT_FRS_TYPE;
            } else {
                this.frs_type = num;
            }
            Integer num2 = builder.pb_type;
            if (num2 == null) {
                this.pb_type = DEFAULT_PB_TYPE;
            } else {
                this.pb_type = num2;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            List<String> list = builder.thumbnail;
            if (list == null) {
                this.thumbnail = DEFAULT_THUMBNAIL;
            } else {
                this.thumbnail = Message.immutableCopyOf(list);
            }
            Long l3 = builder.tag_code;
            if (l3 == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = l3;
            }
            String str3 = builder.tag_name;
            if (str3 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str3;
            }
            Long l4 = builder.zansum;
            if (l4 == null) {
                this.zansum = DEFAULT_ZANSUM;
            } else {
                this.zansum = l4;
            }
            Long l5 = builder.post_num;
            if (l5 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l5;
            }
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            this.twzhibo_info = builder.twzhibo_info;
            Long l6 = builder.forum_id;
            if (l6 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l6;
            }
            String str4 = builder.forum_name;
            if (str4 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str4;
            }
            String str5 = builder.abtest;
            if (str5 == null) {
                this.abtest = "";
            } else {
                this.abtest = str5;
            }
            Integer num4 = builder.source;
            if (num4 == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = num4;
            }
            Long l7 = builder.rank;
            if (l7 == null) {
                this.rank = DEFAULT_RANK;
            } else {
                this.rank = l7;
            }
            Integer num5 = builder.publish_time;
            if (num5 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = num5;
            }
            String str6 = builder.lego_card;
            if (str6 == null) {
                this.lego_card = "";
                return;
            } else {
                this.lego_card = str6;
                return;
            }
        }
        this.excid = builder.excid;
        this.thread_id = builder.thread_id;
        this.frs_type = builder.frs_type;
        this.pb_type = builder.pb_type;
        this.title = builder.title;
        this._abstract = builder._abstract;
        this.thumbnail = Message.immutableCopyOf(builder.thumbnail);
        this.tag_code = builder.tag_code;
        this.tag_name = builder.tag_name;
        this.zansum = builder.zansum;
        this.post_num = builder.post_num;
        this.thread_type = builder.thread_type;
        this.twzhibo_info = builder.twzhibo_info;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.abtest = builder.abtest;
        this.source = builder.source;
        this.rank = builder.rank;
        this.publish_time = builder.publish_time;
        this.lego_card = builder.lego_card;
    }
}
