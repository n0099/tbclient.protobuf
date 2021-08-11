package tbclient.Profile;

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
import tbclient.ThreadInfo;
/* loaded from: classes2.dex */
public final class UserGodInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ADDRESS = "";
    public static final Integer DEFAULT_AGE;
    public static final Integer DEFAULT_CUR_PAGE;
    public static final List<ForumGodDetailInfo> DEFAULT_FORUM_GOD_LIST;
    public static final Integer DEFAULT_GOD_TYPE;
    public static final Integer DEFAULT_SEX;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public static final String DEFAULT_TOTAL_THREAD = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String address;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer age;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer cur_page;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ForumGodDetailInfo> forum_god_list;
    @ProtoField(tag = 2)
    public final GodDetailInfo god_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer god_type;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sex;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String total_thread;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserGodInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String address;
        public Integer age;
        public Integer cur_page;
        public List<ForumGodDetailInfo> forum_god_list;
        public GodDetailInfo god_info;
        public Integer god_type;
        public Integer sex;
        public List<ThreadInfo> thread_list;
        public String total_thread;

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
        public Builder(UserGodInfo userGodInfo) {
            super(userGodInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userGodInfo};
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
            if (userGodInfo == null) {
                return;
            }
            this.god_type = userGodInfo.god_type;
            this.god_info = userGodInfo.god_info;
            this.forum_god_list = Message.copyOf(userGodInfo.forum_god_list);
            this.sex = userGodInfo.sex;
            this.age = userGodInfo.age;
            this.address = userGodInfo.address;
            this.thread_list = Message.copyOf(userGodInfo.thread_list);
            this.cur_page = userGodInfo.cur_page;
            this.total_thread = userGodInfo.total_thread;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserGodInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UserGodInfo(this, z, null) : (UserGodInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-913102388, "Ltbclient/Profile/UserGodInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-913102388, "Ltbclient/Profile/UserGodInfo;");
                return;
            }
        }
        DEFAULT_GOD_TYPE = 0;
        DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
        DEFAULT_SEX = 0;
        DEFAULT_AGE = 0;
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_CUR_PAGE = 0;
    }

    public /* synthetic */ UserGodInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGodInfo(Builder builder, boolean z) {
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
            Integer num = builder.god_type;
            if (num == null) {
                this.god_type = DEFAULT_GOD_TYPE;
            } else {
                this.god_type = num;
            }
            this.god_info = builder.god_info;
            List<ForumGodDetailInfo> list = builder.forum_god_list;
            if (list == null) {
                this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
            } else {
                this.forum_god_list = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.sex;
            if (num2 == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = num2;
            }
            Integer num3 = builder.age;
            if (num3 == null) {
                this.age = DEFAULT_AGE;
            } else {
                this.age = num3;
            }
            String str = builder.address;
            if (str == null) {
                this.address = "";
            } else {
                this.address = str;
            }
            List<ThreadInfo> list2 = builder.thread_list;
            if (list2 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list2);
            }
            Integer num4 = builder.cur_page;
            if (num4 == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
            } else {
                this.cur_page = num4;
            }
            String str2 = builder.total_thread;
            if (str2 == null) {
                this.total_thread = "";
                return;
            } else {
                this.total_thread = str2;
                return;
            }
        }
        this.god_type = builder.god_type;
        this.god_info = builder.god_info;
        this.forum_god_list = Message.immutableCopyOf(builder.forum_god_list);
        this.sex = builder.sex;
        this.age = builder.age;
        this.address = builder.address;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.cur_page = builder.cur_page;
        this.total_thread = builder.total_thread;
    }
}
