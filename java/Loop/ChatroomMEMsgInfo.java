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
/* loaded from: classes9.dex */
public final class ChatroomMEMsgInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_FROM_NAME = "";
    public static final Long DEFAULT_FROM_UID;
    public static final Long DEFAULT_MSG_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String from_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long from_uid;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long msg_id;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ChatroomMEMsgInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String content;
        public String from_name;
        public Long from_uid;
        public Long msg_id;

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
        public Builder(ChatroomMEMsgInfo chatroomMEMsgInfo) {
            super(chatroomMEMsgInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {chatroomMEMsgInfo};
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
            if (chatroomMEMsgInfo == null) {
                return;
            }
            this.from_uid = chatroomMEMsgInfo.from_uid;
            this.from_name = chatroomMEMsgInfo.from_name;
            this.content = chatroomMEMsgInfo.content;
            this.msg_id = chatroomMEMsgInfo.msg_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChatroomMEMsgInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ChatroomMEMsgInfo(this, z, null);
            }
            return (ChatroomMEMsgInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1315617208, "Ltbclient/Loop/ChatroomMEMsgInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1315617208, "Ltbclient/Loop/ChatroomMEMsgInfo;");
                return;
            }
        }
        DEFAULT_FROM_UID = 0L;
        DEFAULT_MSG_ID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatroomMEMsgInfo(Builder builder, boolean z) {
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
            Long l = builder.from_uid;
            if (l == null) {
                this.from_uid = DEFAULT_FROM_UID;
            } else {
                this.from_uid = l;
            }
            String str = builder.from_name;
            if (str == null) {
                this.from_name = "";
            } else {
                this.from_name = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            Long l2 = builder.msg_id;
            if (l2 == null) {
                this.msg_id = DEFAULT_MSG_ID;
                return;
            } else {
                this.msg_id = l2;
                return;
            }
        }
        this.from_uid = builder.from_uid;
        this.from_name = builder.from_name;
        this.content = builder.content;
        this.msg_id = builder.msg_id;
    }

    public /* synthetic */ ChatroomMEMsgInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
