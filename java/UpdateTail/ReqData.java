package tbclient.UpdateTail;

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
/* loaded from: classes8.dex */
public final class ReqData extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FONTCOLOR = "";
    public static final String DEFAULT_FONTKEYNAME = "";
    public static final String DEFAULT_TAILCONTENT = "";
    public static final Integer DEFAULT_TAILID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1336common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String fontColor;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String fontKeyName;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String tailContent;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tailId;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReqData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1337common;
        public String fontColor;
        public String fontKeyName;
        public String tailContent;
        public Integer tailId;

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
        public Builder(ReqData reqData) {
            super(reqData);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {reqData};
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
            if (reqData == null) {
                return;
            }
            this.tailContent = reqData.tailContent;
            this.tailId = reqData.tailId;
            this.fontColor = reqData.fontColor;
            this.fontKeyName = reqData.fontKeyName;
            this.f1337common = reqData.f1336common;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ReqData build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ReqData(this, z, null) : (ReqData) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(48405343, "Ltbclient/UpdateTail/ReqData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(48405343, "Ltbclient/UpdateTail/ReqData;");
                return;
            }
        }
        DEFAULT_TAILID = 0;
    }

    public /* synthetic */ ReqData(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReqData(Builder builder, boolean z) {
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
            String str = builder.tailContent;
            if (str == null) {
                this.tailContent = "";
            } else {
                this.tailContent = str;
            }
            Integer num = builder.tailId;
            if (num == null) {
                this.tailId = DEFAULT_TAILID;
            } else {
                this.tailId = num;
            }
            String str2 = builder.fontColor;
            if (str2 == null) {
                this.fontColor = "";
            } else {
                this.fontColor = str2;
            }
            String str3 = builder.fontKeyName;
            if (str3 == null) {
                this.fontKeyName = "";
            } else {
                this.fontKeyName = str3;
            }
            this.f1336common = builder.f1337common;
            return;
        }
        this.tailContent = builder.tailContent;
        this.tailId = builder.tailId;
        this.fontColor = builder.fontColor;
        this.fontKeyName = builder.fontKeyName;
        this.f1336common = builder.f1337common;
    }
}
