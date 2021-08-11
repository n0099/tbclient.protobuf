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
public final class Wares extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_MONEY;
    public static final String DEFAULT_NEW_PROPS_ID = "";
    public static final Integer DEFAULT_PROPS_ID;
    public static final Integer DEFAULT_PROPS_MON;
    public static final String DEFAULT_WARS_ITEM = "";
    public static final String DEFAULT_WARS_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer money;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String new_props_id;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer props_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer props_mon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String wars_item;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String wars_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<Wares> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer money;
        public String new_props_id;
        public Integer props_id;
        public Integer props_mon;
        public String wars_item;
        public String wars_name;

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
        public Builder(Wares wares) {
            super(wares);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {wares};
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
            if (wares == null) {
                return;
            }
            this.props_id = wares.props_id;
            this.money = wares.money;
            this.props_mon = wares.props_mon;
            this.wars_name = wares.wars_name;
            this.wars_item = wares.wars_item;
            this.new_props_id = wares.new_props_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Wares build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Wares(this, z, null) : (Wares) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(733755087, "Ltbclient/Wares;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(733755087, "Ltbclient/Wares;");
                return;
            }
        }
        DEFAULT_PROPS_ID = 0;
        DEFAULT_MONEY = 0;
        DEFAULT_PROPS_MON = 0;
    }

    public /* synthetic */ Wares(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wares(Builder builder, boolean z) {
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
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            Integer num2 = builder.money;
            if (num2 == null) {
                this.money = DEFAULT_MONEY;
            } else {
                this.money = num2;
            }
            Integer num3 = builder.props_mon;
            if (num3 == null) {
                this.props_mon = DEFAULT_PROPS_MON;
            } else {
                this.props_mon = num3;
            }
            String str = builder.wars_name;
            if (str == null) {
                this.wars_name = "";
            } else {
                this.wars_name = str;
            }
            String str2 = builder.wars_item;
            if (str2 == null) {
                this.wars_item = "";
            } else {
                this.wars_item = str2;
            }
            String str3 = builder.new_props_id;
            if (str3 == null) {
                this.new_props_id = "";
                return;
            } else {
                this.new_props_id = str3;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.money = builder.money;
        this.props_mon = builder.props_mon;
        this.wars_name = builder.wars_name;
        this.wars_item = builder.wars_item;
        this.new_props_id = builder.new_props_id;
    }
}
