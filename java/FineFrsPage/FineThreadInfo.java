package tbclient.FineFrsPage;

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
/* loaded from: classes4.dex */
public final class FineThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final Integer DEFAULT_FORDER;
    public static final Long DEFAULT_FORUMID;
    public static final String DEFAULT_FROMFNAME = "";
    public static final Long DEFAULT_FTID;
    public static final Integer DEFAULT_PUBLISH_TIME;
    public static final String DEFAULT_TAG = "";
    public static final Long DEFAULT_THREADSNUM;
    public static final Integer DEFAULT_THREAD_TYPE;
    public static final List<String> DEFAULT_THUMBNAIL;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_TYPE;
    public static final Long DEFAULT_ZANSUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer forder;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long forumid;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String fromfname;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer publish_time;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String tag;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer thread_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long threadsnum;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> thumbnail;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 12)
    public final ZhiBoInfoTW twzhibo_info;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long zansum;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<FineThreadInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public Integer forder;
        public Long forumid;
        public String fromfname;
        public Long ftid;
        public Integer publish_time;
        public String tag;
        public Integer thread_type;
        public Long threadsnum;
        public List<String> thumbnail;
        public String title;
        public ZhiBoInfoTW twzhibo_info;
        public Integer type;
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
        public Builder(FineThreadInfo fineThreadInfo) {
            super(fineThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {fineThreadInfo};
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
            if (fineThreadInfo == null) {
                return;
            }
            this.ftid = fineThreadInfo.ftid;
            this.title = fineThreadInfo.title;
            this.type = fineThreadInfo.type;
            this._abstract = fineThreadInfo._abstract;
            this.thumbnail = Message.copyOf(fineThreadInfo.thumbnail);
            this.publish_time = fineThreadInfo.publish_time;
            this.tag = fineThreadInfo.tag;
            this.zansum = fineThreadInfo.zansum;
            this.threadsnum = fineThreadInfo.threadsnum;
            this.fromfname = fineThreadInfo.fromfname;
            this.forumid = fineThreadInfo.forumid;
            this.twzhibo_info = fineThreadInfo.twzhibo_info;
            this.thread_type = fineThreadInfo.thread_type;
            this.forder = fineThreadInfo.forder;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FineThreadInfo(this, z, null) : (FineThreadInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1511499476, "Ltbclient/FineFrsPage/FineThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1511499476, "Ltbclient/FineFrsPage/FineThreadInfo;");
                return;
            }
        }
        DEFAULT_FTID = 0L;
        DEFAULT_TYPE = 0;
        DEFAULT_THUMBNAIL = Collections.emptyList();
        DEFAULT_PUBLISH_TIME = 0;
        DEFAULT_ZANSUM = 0L;
        DEFAULT_THREADSNUM = 0L;
        DEFAULT_FORUMID = 0L;
        DEFAULT_THREAD_TYPE = 0;
        DEFAULT_FORDER = 0;
    }

    public /* synthetic */ FineThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FineThreadInfo(Builder builder, boolean z) {
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
            Long l = builder.ftid;
            if (l == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
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
            Integer num2 = builder.publish_time;
            if (num2 == null) {
                this.publish_time = DEFAULT_PUBLISH_TIME;
            } else {
                this.publish_time = num2;
            }
            String str3 = builder.tag;
            if (str3 == null) {
                this.tag = "";
            } else {
                this.tag = str3;
            }
            Long l2 = builder.zansum;
            if (l2 == null) {
                this.zansum = DEFAULT_ZANSUM;
            } else {
                this.zansum = l2;
            }
            Long l3 = builder.threadsnum;
            if (l3 == null) {
                this.threadsnum = DEFAULT_THREADSNUM;
            } else {
                this.threadsnum = l3;
            }
            String str4 = builder.fromfname;
            if (str4 == null) {
                this.fromfname = "";
            } else {
                this.fromfname = str4;
            }
            Long l4 = builder.forumid;
            if (l4 == null) {
                this.forumid = DEFAULT_FORUMID;
            } else {
                this.forumid = l4;
            }
            this.twzhibo_info = builder.twzhibo_info;
            Integer num3 = builder.thread_type;
            if (num3 == null) {
                this.thread_type = DEFAULT_THREAD_TYPE;
            } else {
                this.thread_type = num3;
            }
            Integer num4 = builder.forder;
            if (num4 == null) {
                this.forder = DEFAULT_FORDER;
                return;
            } else {
                this.forder = num4;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this.type = builder.type;
        this._abstract = builder._abstract;
        this.thumbnail = Message.immutableCopyOf(builder.thumbnail);
        this.publish_time = builder.publish_time;
        this.tag = builder.tag;
        this.zansum = builder.zansum;
        this.threadsnum = builder.threadsnum;
        this.fromfname = builder.fromfname;
        this.forumid = builder.forumid;
        this.twzhibo_info = builder.twzhibo_info;
        this.thread_type = builder.thread_type;
        this.forder = builder.forder;
    }
}
