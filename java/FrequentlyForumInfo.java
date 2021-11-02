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
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class FrequentlyForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACCESS_FLAG;
    public static final String DEFAULT_AVATAR = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_FORUM_STATE;
    public static final Integer DEFAULT_IS_SIGN;
    public static final Long DEFAULT_LAST_ACCESS_TIME;
    public static final Integer DEFAULT_LEVEL_ID;
    public static final String DEFAULT_NEW_THREAD_NUM = "";
    public static final List<User> DEFAULT_USER_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer access_flag;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer forum_state;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer is_sign;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long last_access_time;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer level_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String new_thread_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<User> user_list;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<FrequentlyForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer access_flag;
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer forum_state;
        public Integer is_sign;
        public Long last_access_time;
        public Integer level_id;
        public String new_thread_num;
        public List<User> user_list;

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
        public Builder(FrequentlyForumInfo frequentlyForumInfo) {
            super(frequentlyForumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {frequentlyForumInfo};
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
            if (frequentlyForumInfo == null) {
                return;
            }
            this.forum_id = frequentlyForumInfo.forum_id;
            this.new_thread_num = frequentlyForumInfo.new_thread_num;
            this.user_list = Message.copyOf(frequentlyForumInfo.user_list);
            this.last_access_time = frequentlyForumInfo.last_access_time;
            this.forum_name = frequentlyForumInfo.forum_name;
            this.avatar = frequentlyForumInfo.avatar;
            this.level_id = frequentlyForumInfo.level_id;
            this.forum_state = frequentlyForumInfo.forum_state;
            this.access_flag = frequentlyForumInfo.access_flag;
            this.is_sign = frequentlyForumInfo.is_sign;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrequentlyForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new FrequentlyForumInfo(this, z, null) : (FrequentlyForumInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2063690705, "Ltbclient/FrequentlyForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2063690705, "Ltbclient/FrequentlyForumInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_USER_LIST = Collections.emptyList();
        DEFAULT_LAST_ACCESS_TIME = 0L;
        DEFAULT_LEVEL_ID = 0;
        DEFAULT_FORUM_STATE = 0;
        DEFAULT_ACCESS_FLAG = 0;
        DEFAULT_IS_SIGN = 0;
    }

    public /* synthetic */ FrequentlyForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequentlyForumInfo(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.new_thread_num;
            if (str == null) {
                this.new_thread_num = "";
            } else {
                this.new_thread_num = str;
            }
            List<User> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
            } else {
                this.user_list = Message.immutableCopyOf(list);
            }
            Long l2 = builder.last_access_time;
            if (l2 == null) {
                this.last_access_time = DEFAULT_LAST_ACCESS_TIME;
            } else {
                this.last_access_time = l2;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            String str3 = builder.avatar;
            if (str3 == null) {
                this.avatar = "";
            } else {
                this.avatar = str3;
            }
            Integer num = builder.level_id;
            if (num == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = num;
            }
            Integer num2 = builder.forum_state;
            if (num2 == null) {
                this.forum_state = DEFAULT_FORUM_STATE;
            } else {
                this.forum_state = num2;
            }
            Integer num3 = builder.access_flag;
            if (num3 == null) {
                this.access_flag = DEFAULT_ACCESS_FLAG;
            } else {
                this.access_flag = num3;
            }
            Integer num4 = builder.is_sign;
            if (num4 == null) {
                this.is_sign = DEFAULT_IS_SIGN;
                return;
            } else {
                this.is_sign = num4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.new_thread_num = builder.new_thread_num;
        this.user_list = Message.immutableCopyOf(builder.user_list);
        this.last_access_time = builder.last_access_time;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.level_id = builder.level_id;
        this.forum_state = builder.forum_state;
        this.access_flag = builder.access_flag;
        this.is_sign = builder.is_sign;
    }
}
