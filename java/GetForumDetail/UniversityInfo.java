package tbclient.GetForumDetail;

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
/* loaded from: classes8.dex */
public final class UniversityInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AGREE_NUM;
    public static final Long DEFAULT_BROWSE_NUM;
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TO_URL = "";
    public static final Integer DEFAULT_TYPE;
    public static final Long DEFAULT_VIDEO_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long agree_num;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long browse_num;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String to_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long video_time;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<UniversityInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long agree_num;
        public Long browse_num;
        public String pic_url;
        public String title;
        public String to_url;
        public Integer type;
        public Long video_time;

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
        public Builder(UniversityInfo universityInfo) {
            super(universityInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {universityInfo};
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
            if (universityInfo == null) {
                return;
            }
            this.title = universityInfo.title;
            this.pic_url = universityInfo.pic_url;
            this.to_url = universityInfo.to_url;
            this.type = universityInfo.type;
            this.agree_num = universityInfo.agree_num;
            this.browse_num = universityInfo.browse_num;
            this.video_time = universityInfo.video_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UniversityInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UniversityInfo(this, z, null) : (UniversityInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-335783370, "Ltbclient/GetForumDetail/UniversityInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-335783370, "Ltbclient/GetForumDetail/UniversityInfo;");
                return;
            }
        }
        DEFAULT_TYPE = 0;
        DEFAULT_AGREE_NUM = 0L;
        DEFAULT_BROWSE_NUM = 0L;
        DEFAULT_VIDEO_TIME = 0L;
    }

    public /* synthetic */ UniversityInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversityInfo(Builder builder, boolean z) {
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
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.pic_url;
            if (str2 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str2;
            }
            String str3 = builder.to_url;
            if (str3 == null) {
                this.to_url = "";
            } else {
                this.to_url = str3;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l = builder.agree_num;
            if (l == null) {
                this.agree_num = DEFAULT_AGREE_NUM;
            } else {
                this.agree_num = l;
            }
            Long l2 = builder.browse_num;
            if (l2 == null) {
                this.browse_num = DEFAULT_BROWSE_NUM;
            } else {
                this.browse_num = l2;
            }
            Long l3 = builder.video_time;
            if (l3 == null) {
                this.video_time = DEFAULT_VIDEO_TIME;
                return;
            } else {
                this.video_time = l3;
                return;
            }
        }
        this.title = builder.title;
        this.pic_url = builder.pic_url;
        this.to_url = builder.to_url;
        this.type = builder.type;
        this.agree_num = builder.agree_num;
        this.browse_num = builder.browse_num;
        this.video_time = builder.video_time;
    }
}
