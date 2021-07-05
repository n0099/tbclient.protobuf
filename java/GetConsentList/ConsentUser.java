package tbclient.GetConsentList;

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
/* loaded from: classes10.dex */
public final class ConsentUser extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_AUTHOR_ID;
    public static final String DEFAULT_AUTHOR_NAME = "";
    public static final String DEFAULT_AUTHOR_NAME_SHOW = "";
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Long DEFAULT_GID;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_POST_ID;
    public static final Long DEFAULT_THREAD_ID;
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final String DEFAULT_USER_NAME_SHOW = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String author_name;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String author_name_show;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long gid;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String user_name_show;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ConsentUser> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long author_id;
        public String author_name;
        public String author_name_show;
        public Integer create_time;
        public Long gid;
        public String portrait;
        public Long post_id;
        public Long thread_id;
        public Long user_id;
        public String user_name;
        public String user_name_show;

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
        public Builder(ConsentUser consentUser) {
            super(consentUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {consentUser};
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
            if (consentUser == null) {
                return;
            }
            this.user_id = consentUser.user_id;
            this.user_name = consentUser.user_name;
            this.author_id = consentUser.author_id;
            this.author_name = consentUser.author_name;
            this.portrait = consentUser.portrait;
            this.thread_id = consentUser.thread_id;
            this.post_id = consentUser.post_id;
            this.create_time = consentUser.create_time;
            this.gid = consentUser.gid;
            this.author_name_show = consentUser.author_name_show;
            this.user_name_show = consentUser.user_name_show;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ConsentUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ConsentUser(this, z, null) : (ConsentUser) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2121257241, "Ltbclient/GetConsentList/ConsentUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2121257241, "Ltbclient/GetConsentList/ConsentUser;");
                return;
            }
        }
        DEFAULT_USER_ID = 0L;
        DEFAULT_AUTHOR_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_POST_ID = 0L;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_GID = 0L;
    }

    public /* synthetic */ ConsentUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentUser(Builder builder, boolean z) {
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
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l2;
            }
            String str2 = builder.author_name;
            if (str2 == null) {
                this.author_name = "";
            } else {
                this.author_name = str2;
            }
            String str3 = builder.portrait;
            if (str3 == null) {
                this.portrait = "";
            } else {
                this.portrait = str3;
            }
            Long l3 = builder.thread_id;
            if (l3 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l3;
            }
            Long l4 = builder.post_id;
            if (l4 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l4;
            }
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            Long l5 = builder.gid;
            if (l5 == null) {
                this.gid = DEFAULT_GID;
            } else {
                this.gid = l5;
            }
            String str4 = builder.author_name_show;
            if (str4 == null) {
                this.author_name_show = "";
            } else {
                this.author_name_show = str4;
            }
            String str5 = builder.user_name_show;
            if (str5 == null) {
                this.user_name_show = "";
                return;
            } else {
                this.user_name_show = str5;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.author_id = builder.author_id;
        this.author_name = builder.author_name;
        this.portrait = builder.portrait;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.create_time = builder.create_time;
        this.gid = builder.gid;
        this.author_name_show = builder.author_name_show;
        this.user_name_show = builder.user_name_show;
    }
}
