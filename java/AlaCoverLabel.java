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
public final class AlaCoverLabel extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_LABEL_ID;
    public static final String DEFAULT_LABEL_NAME = "";
    public static final String DEFAULT_LABEL_RGB = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer label_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String label_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String label_rgb;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AlaCoverLabel> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer label_id;
        public String label_name;
        public String label_rgb;

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
        public Builder(AlaCoverLabel alaCoverLabel) {
            super(alaCoverLabel);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {alaCoverLabel};
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
            if (alaCoverLabel == null) {
                return;
            }
            this.label_id = alaCoverLabel.label_id;
            this.label_name = alaCoverLabel.label_name;
            this.label_rgb = alaCoverLabel.label_rgb;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaCoverLabel build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AlaCoverLabel(this, z, null) : (AlaCoverLabel) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-65771950, "Ltbclient/AlaCoverLabel;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-65771950, "Ltbclient/AlaCoverLabel;");
                return;
            }
        }
        DEFAULT_LABEL_ID = 0;
    }

    public /* synthetic */ AlaCoverLabel(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlaCoverLabel(Builder builder, boolean z) {
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
            Integer num = builder.label_id;
            if (num == null) {
                this.label_id = DEFAULT_LABEL_ID;
            } else {
                this.label_id = num;
            }
            String str = builder.label_name;
            if (str == null) {
                this.label_name = "";
            } else {
                this.label_name = str;
            }
            String str2 = builder.label_rgb;
            if (str2 == null) {
                this.label_rgb = "";
                return;
            } else {
                this.label_rgb = str2;
                return;
            }
        }
        this.label_id = builder.label_id;
        this.label_name = builder.label_name;
        this.label_rgb = builder.label_rgb;
    }
}
