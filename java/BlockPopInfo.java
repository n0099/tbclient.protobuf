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
public final class BlockPopInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AHEAD_INFO = "";
    public static final Integer DEFAULT_AHEAD_TYPE;
    public static final String DEFAULT_AHEAD_URL = "";
    public static final String DEFAULT_APPEAL_MSG = "";
    public static final Integer DEFAULT_APPEAL_STATUS;
    public static final String DEFAULT_BLOCK_INFO = "";
    public static final Integer DEFAULT_CAN_POST;
    public static final String DEFAULT_OK_INFO = "";
    public static final String DEFAULT_SUB_BLOCK_INFO = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ahead_info;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer ahead_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ahead_url;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String appeal_msg;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer appeal_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String block_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer can_post;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ok_info;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String sub_block_info;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BlockPopInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ahead_info;
        public Integer ahead_type;
        public String ahead_url;
        public String appeal_msg;
        public Integer appeal_status;
        public String block_info;
        public Integer can_post;
        public String ok_info;
        public String sub_block_info;

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
        public Builder(BlockPopInfo blockPopInfo) {
            super(blockPopInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {blockPopInfo};
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
            if (blockPopInfo == null) {
                return;
            }
            this.can_post = blockPopInfo.can_post;
            this.block_info = blockPopInfo.block_info;
            this.ahead_info = blockPopInfo.ahead_info;
            this.ahead_url = blockPopInfo.ahead_url;
            this.ok_info = blockPopInfo.ok_info;
            this.ahead_type = blockPopInfo.ahead_type;
            this.appeal_status = blockPopInfo.appeal_status;
            this.appeal_msg = blockPopInfo.appeal_msg;
            this.sub_block_info = blockPopInfo.sub_block_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BlockPopInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new BlockPopInfo(this, z, null);
            }
            return (BlockPopInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1703946113, "Ltbclient/BlockPopInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1703946113, "Ltbclient/BlockPopInfo;");
                return;
            }
        }
        DEFAULT_CAN_POST = 0;
        DEFAULT_AHEAD_TYPE = 0;
        DEFAULT_APPEAL_STATUS = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockPopInfo(Builder builder, boolean z) {
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
            Integer num = builder.can_post;
            if (num == null) {
                this.can_post = DEFAULT_CAN_POST;
            } else {
                this.can_post = num;
            }
            String str = builder.block_info;
            if (str == null) {
                this.block_info = "";
            } else {
                this.block_info = str;
            }
            String str2 = builder.ahead_info;
            if (str2 == null) {
                this.ahead_info = "";
            } else {
                this.ahead_info = str2;
            }
            String str3 = builder.ahead_url;
            if (str3 == null) {
                this.ahead_url = "";
            } else {
                this.ahead_url = str3;
            }
            String str4 = builder.ok_info;
            if (str4 == null) {
                this.ok_info = "";
            } else {
                this.ok_info = str4;
            }
            Integer num2 = builder.ahead_type;
            if (num2 == null) {
                this.ahead_type = DEFAULT_AHEAD_TYPE;
            } else {
                this.ahead_type = num2;
            }
            Integer num3 = builder.appeal_status;
            if (num3 == null) {
                this.appeal_status = DEFAULT_APPEAL_STATUS;
            } else {
                this.appeal_status = num3;
            }
            String str5 = builder.appeal_msg;
            if (str5 == null) {
                this.appeal_msg = "";
            } else {
                this.appeal_msg = str5;
            }
            String str6 = builder.sub_block_info;
            if (str6 == null) {
                this.sub_block_info = "";
                return;
            } else {
                this.sub_block_info = str6;
                return;
            }
        }
        this.can_post = builder.can_post;
        this.block_info = builder.block_info;
        this.ahead_info = builder.ahead_info;
        this.ahead_url = builder.ahead_url;
        this.ok_info = builder.ok_info;
        this.ahead_type = builder.ahead_type;
        this.appeal_status = builder.appeal_status;
        this.appeal_msg = builder.appeal_msg;
        this.sub_block_info = builder.sub_block_info;
    }

    public /* synthetic */ BlockPopInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
