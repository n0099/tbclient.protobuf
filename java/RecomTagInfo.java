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
/* loaded from: classes9.dex */
public final class RecomTagInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FIRST_CLASS = "";
    public static final Integer DEFAULT_ID;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIC = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String first_class;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String first_class;
        public Integer id;
        public String name;
        public String pic;

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
        public Builder(RecomTagInfo recomTagInfo) {
            super(recomTagInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {recomTagInfo};
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
            if (recomTagInfo == null) {
                return;
            }
            this.id = recomTagInfo.id;
            this.name = recomTagInfo.name;
            this.pic = recomTagInfo.pic;
            this.first_class = recomTagInfo.first_class;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecomTagInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new RecomTagInfo(this, z, null);
            }
            return (RecomTagInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1718067785, "Ltbclient/RecomTagInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1718067785, "Ltbclient/RecomTagInfo;");
                return;
            }
        }
        DEFAULT_ID = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomTagInfo(Builder builder, boolean z) {
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
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.pic;
            if (str2 == null) {
                this.pic = "";
            } else {
                this.pic = str2;
            }
            String str3 = builder.first_class;
            if (str3 == null) {
                this.first_class = "";
                return;
            } else {
                this.first_class = str3;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.pic = builder.pic;
        this.first_class = builder.first_class;
    }

    public /* synthetic */ RecomTagInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
