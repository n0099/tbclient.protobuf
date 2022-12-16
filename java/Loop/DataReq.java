package tbclient.Loop;

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
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CHATROOM_ID;
    public static final String DEFAULT_CHATROOM_NEW_MSG = "";
    public static final String DEFAULT_DATA_TYPE = "";
    public static final Long DEFAULT_FID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_UNIQ_ID = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long chatroom_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String chatroom_new_msg;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1323common;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String data_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long fid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String uniq_id;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long chatroom_id;
        public String chatroom_new_msg;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1324common;
        public String data_type;
        public Long fid;
        public String forum_name;
        public String uniq_id;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.f1324common = dataReq.f1323common;
            this.data_type = dataReq.data_type;
            this.chatroom_new_msg = dataReq.chatroom_new_msg;
            this.fid = dataReq.fid;
            this.chatroom_id = dataReq.chatroom_id;
            this.uniq_id = dataReq.uniq_id;
            this.forum_name = dataReq.forum_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataReq(this, z, null);
            }
            return (DataReq) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-280542040, "Ltbclient/Loop/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-280542040, "Ltbclient/Loop/DataReq;");
                return;
            }
        }
        DEFAULT_FID = 0L;
        DEFAULT_CHATROOM_ID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataReq(Builder builder, boolean z) {
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
            this.f1323common = builder.f1324common;
            String str = builder.data_type;
            if (str == null) {
                this.data_type = "";
            } else {
                this.data_type = str;
            }
            String str2 = builder.chatroom_new_msg;
            if (str2 == null) {
                this.chatroom_new_msg = "";
            } else {
                this.chatroom_new_msg = str2;
            }
            Long l = builder.fid;
            if (l == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l;
            }
            Long l2 = builder.chatroom_id;
            if (l2 == null) {
                this.chatroom_id = DEFAULT_CHATROOM_ID;
            } else {
                this.chatroom_id = l2;
            }
            String str3 = builder.uniq_id;
            if (str3 == null) {
                this.uniq_id = "";
            } else {
                this.uniq_id = str3;
            }
            String str4 = builder.forum_name;
            if (str4 == null) {
                this.forum_name = "";
                return;
            } else {
                this.forum_name = str4;
                return;
            }
        }
        this.f1323common = builder.f1324common;
        this.data_type = builder.data_type;
        this.chatroom_new_msg = builder.chatroom_new_msg;
        this.fid = builder.fid;
        this.chatroom_id = builder.chatroom_id;
        this.uniq_id = builder.uniq_id;
        this.forum_name = builder.forum_name;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
