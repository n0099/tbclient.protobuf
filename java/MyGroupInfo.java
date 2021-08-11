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
/* loaded from: classes2.dex */
public final class MyGroupInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_GROUP_ID;
    public static final String DEFAULT_GROUP_NAME = "";
    public static final Integer DEFAULT_MAX_MEMBER_NUM;
    public static final Integer DEFAULT_MEMBER_NUM;
    public static final String DEFAULT_PORTRAIT = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long group_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String group_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer max_member_num;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer member_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<MyGroupInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long group_id;
        public String group_name;
        public Integer max_member_num;
        public Integer member_num;
        public String portrait;

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
        public Builder(MyGroupInfo myGroupInfo) {
            super(myGroupInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {myGroupInfo};
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
            if (myGroupInfo == null) {
                return;
            }
            this.group_id = myGroupInfo.group_id;
            this.group_name = myGroupInfo.group_name;
            this.portrait = myGroupInfo.portrait;
            this.member_num = myGroupInfo.member_num;
            this.max_member_num = myGroupInfo.max_member_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MyGroupInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new MyGroupInfo(this, z, null) : (MyGroupInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(218451652, "Ltbclient/MyGroupInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(218451652, "Ltbclient/MyGroupInfo;");
                return;
            }
        }
        DEFAULT_GROUP_ID = 0L;
        DEFAULT_MEMBER_NUM = 0;
        DEFAULT_MAX_MEMBER_NUM = 0;
    }

    public /* synthetic */ MyGroupInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyGroupInfo(Builder builder, boolean z) {
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
            Long l = builder.group_id;
            if (l == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = l;
            }
            String str = builder.group_name;
            if (str == null) {
                this.group_name = "";
            } else {
                this.group_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.member_num;
            if (num == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = num;
            }
            Integer num2 = builder.max_member_num;
            if (num2 == null) {
                this.max_member_num = DEFAULT_MAX_MEMBER_NUM;
                return;
            } else {
                this.max_member_num = num2;
                return;
            }
        }
        this.group_id = builder.group_id;
        this.group_name = builder.group_name;
        this.portrait = builder.portrait;
        this.member_num = builder.member_num;
        this.max_member_num = builder.max_member_num;
    }
}
