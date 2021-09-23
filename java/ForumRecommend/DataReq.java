package tbclient.ForumRecommend;

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
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_LIKE_FORUM;
    public static final Integer DEFAULT_RECOMMEND;
    public static final Integer DEFAULT_SORT_TYPE;
    public static final Integer DEFAULT_TOPIC;
    public static final String DEFAULT_VISIT_HISTORY = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f79935common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer like_forum;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer recommend;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer topic;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String visit_history;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f79936common;
        public Integer like_forum;
        public Integer recommend;
        public Integer sort_type;
        public Integer topic;
        public String visit_history;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.like_forum = dataReq.like_forum;
            this.topic = dataReq.topic;
            this.recommend = dataReq.recommend;
            this.f79936common = dataReq.f79935common;
            this.visit_history = dataReq.visit_history;
            this.sort_type = dataReq.sort_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1886599919, "Ltbclient/ForumRecommend/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1886599919, "Ltbclient/ForumRecommend/DataReq;");
                return;
            }
        }
        DEFAULT_LIKE_FORUM = 0;
        DEFAULT_TOPIC = 0;
        DEFAULT_RECOMMEND = 0;
        DEFAULT_SORT_TYPE = 0;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataReq(Builder builder, boolean z) {
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
            Integer num = builder.like_forum;
            if (num == null) {
                this.like_forum = DEFAULT_LIKE_FORUM;
            } else {
                this.like_forum = num;
            }
            Integer num2 = builder.topic;
            if (num2 == null) {
                this.topic = DEFAULT_TOPIC;
            } else {
                this.topic = num2;
            }
            Integer num3 = builder.recommend;
            if (num3 == null) {
                this.recommend = DEFAULT_RECOMMEND;
            } else {
                this.recommend = num3;
            }
            this.f79935common = builder.f79936common;
            String str = builder.visit_history;
            if (str == null) {
                this.visit_history = "";
            } else {
                this.visit_history = str;
            }
            Integer num4 = builder.sort_type;
            if (num4 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
                return;
            } else {
                this.sort_type = num4;
                return;
            }
        }
        this.like_forum = builder.like_forum;
        this.topic = builder.topic;
        this.recommend = builder.recommend;
        this.f79935common = builder.f79936common;
        this.visit_history = builder.visit_history;
        this.sort_type = builder.sort_type;
    }
}
