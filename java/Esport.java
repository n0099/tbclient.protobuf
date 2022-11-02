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
public final class Esport extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<EsportRank> DEFAULT_BILLBOARD;
    public static final Integer DEFAULT_FLOOR_NO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)
    public final EsportStatic _static;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<EsportRank> billboard;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer floor_no;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Esport> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public EsportStatic _static;
        public List<EsportRank> billboard;
        public Integer floor_no;

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
        public Builder(Esport esport) {
            super(esport);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {esport};
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
            if (esport == null) {
                return;
            }
            this._static = esport._static;
            this.floor_no = esport.floor_no;
            this.billboard = Message.copyOf(esport.billboard);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Esport build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Esport(this, z, null);
            }
            return (Esport) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1304816702, "Ltbclient/Esport;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1304816702, "Ltbclient/Esport;");
                return;
            }
        }
        DEFAULT_FLOOR_NO = 0;
        DEFAULT_BILLBOARD = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Esport(Builder builder, boolean z) {
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
            this._static = builder._static;
            Integer num = builder.floor_no;
            if (num == null) {
                this.floor_no = DEFAULT_FLOOR_NO;
            } else {
                this.floor_no = num;
            }
            List<EsportRank> list = builder.billboard;
            if (list == null) {
                this.billboard = DEFAULT_BILLBOARD;
                return;
            } else {
                this.billboard = Message.immutableCopyOf(list);
                return;
            }
        }
        this._static = builder._static;
        this.floor_no = builder.floor_no;
        this.billboard = Message.immutableCopyOf(builder.billboard);
    }

    public /* synthetic */ Esport(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
