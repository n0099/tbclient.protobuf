package tbclient.Replylist;

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
public final class Reply extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AT_UID;
    public static final String DEFAULT_AT_UNAME = "";
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_CREATE_TIME = "";
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long at_uid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String at_uname;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String create_time;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long at_uid;
        public String at_uname;
        public String content;
        public String create_time;
        public Long id;
        public String portrait;
        public String user_name;

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
        public Builder(Reply reply) {
            super(reply);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {reply};
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
            if (reply == null) {
                return;
            }
            this.user_name = reply.user_name;
            this.portrait = reply.portrait;
            this.content = reply.content;
            this.create_time = reply.create_time;
            this.id = reply.id;
            this.at_uid = reply.at_uid;
            this.at_uname = reply.at_uname;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Reply build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Reply(this, z, null);
            }
            return (Reply) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-375982846, "Ltbclient/Replylist/Reply;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-375982846, "Ltbclient/Replylist/Reply;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_AT_UID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Reply(Builder builder, boolean z) {
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
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.content;
            if (str3 == null) {
                this.content = "";
            } else {
                this.content = str3;
            }
            String str4 = builder.create_time;
            if (str4 == null) {
                this.create_time = "";
            } else {
                this.create_time = str4;
            }
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            Long l2 = builder.at_uid;
            if (l2 == null) {
                this.at_uid = DEFAULT_AT_UID;
            } else {
                this.at_uid = l2;
            }
            String str5 = builder.at_uname;
            if (str5 == null) {
                this.at_uname = "";
                return;
            } else {
                this.at_uname = str5;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.content = builder.content;
        this.create_time = builder.create_time;
        this.id = builder.id;
        this.at_uid = builder.at_uid;
        this.at_uname = builder.at_uname;
    }

    public /* synthetic */ Reply(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
