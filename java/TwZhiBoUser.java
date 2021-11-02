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
/* loaded from: classes3.dex */
public final class TwZhiBoUser extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ANCHOR_LEVEL;
    public static final String DEFAULT_FIELD_EX = "";
    public static final Integer DEFAULT_IN_BLACK_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer anchor_level;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String field_ex;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer in_black_list;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<TwZhiBoUser> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer anchor_level;
        public String field_ex;
        public Integer in_black_list;

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
        public Builder(TwZhiBoUser twZhiBoUser) {
            super(twZhiBoUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {twZhiBoUser};
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
            if (twZhiBoUser == null) {
                return;
            }
            this.anchor_level = twZhiBoUser.anchor_level;
            this.in_black_list = twZhiBoUser.in_black_list;
            this.field_ex = twZhiBoUser.field_ex;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwZhiBoUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TwZhiBoUser(this, z, null) : (TwZhiBoUser) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1974478549, "Ltbclient/TwZhiBoUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1974478549, "Ltbclient/TwZhiBoUser;");
                return;
            }
        }
        DEFAULT_ANCHOR_LEVEL = 0;
        DEFAULT_IN_BLACK_LIST = 0;
    }

    public /* synthetic */ TwZhiBoUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwZhiBoUser(Builder builder, boolean z) {
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
            Integer num = builder.anchor_level;
            if (num == null) {
                this.anchor_level = DEFAULT_ANCHOR_LEVEL;
            } else {
                this.anchor_level = num;
            }
            Integer num2 = builder.in_black_list;
            if (num2 == null) {
                this.in_black_list = DEFAULT_IN_BLACK_LIST;
            } else {
                this.in_black_list = num2;
            }
            String str = builder.field_ex;
            if (str == null) {
                this.field_ex = "";
                return;
            } else {
                this.field_ex = str;
                return;
            }
        }
        this.anchor_level = builder.anchor_level;
        this.in_black_list = builder.in_black_list;
        this.field_ex = builder.field_ex;
    }
}
