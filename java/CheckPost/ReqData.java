package tbclient.CheckPost;

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
    public static final String DEFAULT_FORUMNAME = "";
    public static final String DEFAULT_ORI_UGC_NID = "";
    public static final String DEFAULT_ORI_UGC_TID = "";
    public static final Integer DEFAULT_ORI_UGC_TYPE;
    public static final String DEFAULT_ORI_UGC_VID = "";
    public static final Long DEFAULT_PID;
    public static final Integer DEFAULT_POSTTYPE;
    public static final Long DEFAULT_TID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1825common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forumName;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String ori_ugc_nid;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ori_ugc_tid;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer ori_ugc_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String ori_ugc_vid;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pid;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer postType;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long tid;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ReqData> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1826common;
        public String forumName;
        public String ori_ugc_nid;
        public String ori_ugc_tid;
        public Integer ori_ugc_type;
        public String ori_ugc_vid;
        public Long pid;
        public Integer postType;
        public Long tid;

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
            this.pid = reqData.pid;
            this.postType = reqData.postType;
            this.forumName = reqData.forumName;
            this.f1826common = reqData.f1825common;
            this.tid = reqData.tid;
            this.ori_ugc_type = reqData.ori_ugc_type;
            this.ori_ugc_nid = reqData.ori_ugc_nid;
            this.ori_ugc_vid = reqData.ori_ugc_vid;
            this.ori_ugc_tid = reqData.ori_ugc_tid;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(810490564, "Ltbclient/CheckPost/ReqData;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(810490564, "Ltbclient/CheckPost/ReqData;");
                return;
            }
        }
        DEFAULT_PID = 0L;
        DEFAULT_POSTTYPE = 0;
        DEFAULT_TID = 0L;
        DEFAULT_ORI_UGC_TYPE = 0;
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
            Long l = builder.pid;
            if (l == null) {
                this.pid = DEFAULT_PID;
            } else {
                this.pid = l;
            }
            Integer num = builder.postType;
            if (num == null) {
                this.postType = DEFAULT_POSTTYPE;
            } else {
                this.postType = num;
            }
            String str = builder.forumName;
            if (str == null) {
                this.forumName = "";
            } else {
                this.forumName = str;
            }
            this.f1825common = builder.f1826common;
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l2;
            }
            Integer num2 = builder.ori_ugc_type;
            if (num2 == null) {
                this.ori_ugc_type = DEFAULT_ORI_UGC_TYPE;
            } else {
                this.ori_ugc_type = num2;
            }
            String str2 = builder.ori_ugc_nid;
            if (str2 == null) {
                this.ori_ugc_nid = "";
            } else {
                this.ori_ugc_nid = str2;
            }
            String str3 = builder.ori_ugc_vid;
            if (str3 == null) {
                this.ori_ugc_vid = "";
            } else {
                this.ori_ugc_vid = str3;
            }
            String str4 = builder.ori_ugc_tid;
            if (str4 == null) {
                this.ori_ugc_tid = "";
                return;
            } else {
                this.ori_ugc_tid = str4;
                return;
            }
        }
        this.pid = builder.pid;
        this.postType = builder.postType;
        this.forumName = builder.forumName;
        this.f1825common = builder.f1826common;
        this.tid = builder.tid;
        this.ori_ugc_type = builder.ori_ugc_type;
        this.ori_ugc_nid = builder.ori_ugc_nid;
        this.ori_ugc_vid = builder.ori_ugc_vid;
        this.ori_ugc_tid = builder.ori_ugc_tid;
    }
}
