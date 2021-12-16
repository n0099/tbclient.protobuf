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
/* loaded from: classes4.dex */
public final class AlaShareInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_RECORD_TID;
    public static final Integer DEFAULT_SHARE_COUNT;
    public static final Integer DEFAULT_SHARE_USER_COUNT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long record_tid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer share_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer share_user_count;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<AlaShareInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String content;
        public Long record_tid;
        public Integer share_count;
        public Integer share_user_count;

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
        public Builder(AlaShareInfo alaShareInfo) {
            super(alaShareInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {alaShareInfo};
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
            if (alaShareInfo == null) {
                return;
            }
            this.content = alaShareInfo.content;
            this.share_user_count = alaShareInfo.share_user_count;
            this.share_count = alaShareInfo.share_count;
            this.record_tid = alaShareInfo.record_tid;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaShareInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AlaShareInfo(this, z, null) : (AlaShareInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-135787974, "Ltbclient/AlaShareInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-135787974, "Ltbclient/AlaShareInfo;");
                return;
            }
        }
        DEFAULT_SHARE_USER_COUNT = 0;
        DEFAULT_SHARE_COUNT = 0;
        DEFAULT_RECORD_TID = 0L;
    }

    public /* synthetic */ AlaShareInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlaShareInfo(Builder builder, boolean z) {
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
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            Integer num = builder.share_user_count;
            if (num == null) {
                this.share_user_count = DEFAULT_SHARE_USER_COUNT;
            } else {
                this.share_user_count = num;
            }
            Integer num2 = builder.share_count;
            if (num2 == null) {
                this.share_count = DEFAULT_SHARE_COUNT;
            } else {
                this.share_count = num2;
            }
            Long l = builder.record_tid;
            if (l == null) {
                this.record_tid = DEFAULT_RECORD_TID;
                return;
            } else {
                this.record_tid = l;
                return;
            }
        }
        this.content = builder.content;
        this.share_user_count = builder.share_user_count;
        this.share_count = builder.share_count;
        this.record_tid = builder.record_tid;
    }
}
