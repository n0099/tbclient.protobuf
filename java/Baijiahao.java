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
/* loaded from: classes8.dex */
public final class Baijiahao extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FORWARD_URL = "";
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final Integer DEFAULT_ORI_UGC_TYPE;
    public static final String DEFAULT_ORI_UGC_VID = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String forward_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer ori_ugc_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Baijiahao> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String forward_url;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public Integer ori_ugc_type;
        public String ori_ugc_vid;

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
        public Builder(Baijiahao baijiahao) {
            super(baijiahao);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {baijiahao};
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
            if (baijiahao == null) {
                return;
            }
            this.ori_ugc_nid = baijiahao.ori_ugc_nid;
            this.ori_ugc_tid = baijiahao.ori_ugc_tid;
            this.ori_ugc_type = baijiahao.ori_ugc_type;
            this.ori_ugc_vid = baijiahao.ori_ugc_vid;
            this.forward_url = baijiahao.forward_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Baijiahao build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Baijiahao(this, z, null) : (Baijiahao) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(987515783, "Ltbclient/Baijiahao;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(987515783, "Ltbclient/Baijiahao;");
                return;
            }
        }
        DEFAULT_ORI_UGC_TYPE = 0;
    }

    public /* synthetic */ Baijiahao(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Baijiahao(Builder builder, boolean z) {
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
            String str = builder.ori_ugc_nid;
            if (str == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str;
            }
            String str2 = builder.ori_ugc_tid;
            if (str2 == null) {
                this.ori_ugc_tid = "";
            } else {
                this.ori_ugc_tid = str2;
            }
            Integer num = builder.ori_ugc_type;
            if (num == null) {
                this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
            } else {
                this.ori_ugc_type = num;
            }
            String str3 = builder.ori_ugc_vid;
            if (str3 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str3;
            }
            String str4 = builder.forward_url;
            if (str4 == null) {
                this.forward_url = "";
                return;
            } else {
                this.forward_url = str4;
                return;
            }
        }
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.forward_url = builder.forward_url;
    }
}
