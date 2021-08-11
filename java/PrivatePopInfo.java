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
/* loaded from: classes2.dex */
public final class PrivatePopInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_POP_CONTENT = "";
    public static final Integer DEFAULT_POP_FORUM_ID;
    public static final String DEFAULT_POP_TYPE = "";
    public static final String DEFAULT_POP_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pop_content;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pop_forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pop_type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pop_url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PrivatePopInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String pop_content;
        public Integer pop_forum_id;
        public String pop_type;
        public String pop_url;

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
        public Builder(PrivatePopInfo privatePopInfo) {
            super(privatePopInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {privatePopInfo};
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
            if (privatePopInfo == null) {
                return;
            }
            this.pop_type = privatePopInfo.pop_type;
            this.pop_content = privatePopInfo.pop_content;
            this.pop_url = privatePopInfo.pop_url;
            this.pop_forum_id = privatePopInfo.pop_forum_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivatePopInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PrivatePopInfo(this, z, null) : (PrivatePopInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1933810187, "Ltbclient/PrivatePopInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1933810187, "Ltbclient/PrivatePopInfo;");
                return;
            }
        }
        DEFAULT_POP_FORUM_ID = 0;
    }

    public /* synthetic */ PrivatePopInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivatePopInfo(Builder builder, boolean z) {
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
            String str = builder.pop_type;
            if (str == null) {
                this.pop_type = "";
            } else {
                this.pop_type = str;
            }
            String str2 = builder.pop_content;
            if (str2 == null) {
                this.pop_content = "";
            } else {
                this.pop_content = str2;
            }
            String str3 = builder.pop_url;
            if (str3 == null) {
                this.pop_url = "";
            } else {
                this.pop_url = str3;
            }
            Integer num = builder.pop_forum_id;
            if (num == null) {
                this.pop_forum_id = DEFAULT_POP_FORUM_ID;
                return;
            } else {
                this.pop_forum_id = num;
                return;
            }
        }
        this.pop_type = builder.pop_type;
        this.pop_content = builder.pop_content;
        this.pop_url = builder.pop_url;
        this.pop_forum_id = builder.pop_forum_id;
    }
}
