package tbclient.RecommendFriend;

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
public final class UserInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_DISTANCE;
    public static final Long DEFAULT_ID;
    public static final String DEFAULT_INTRO = "";
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_SEX;
    public static final String DEFAULT_ST_TYPE = "";
    public static final String DEFAULT_TAG_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer distance;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String intro;
    @ProtoField(tag = 8)
    public final LbsInfo location;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer sex;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String tag_name;
    @ProtoField(tag = 7)
    public final ShowIcon tshow_icon;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer distance;
        public Long id;
        public String intro;
        public LbsInfo location;
        public String message;
        public String name;
        public String portrait;
        public Integer sex;
        public String st_type;
        public String tag_name;
        public ShowIcon tshow_icon;

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
        public Builder(UserInfo userInfo) {
            super(userInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userInfo};
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
            if (userInfo == null) {
                return;
            }
            this.id = userInfo.id;
            this.portrait = userInfo.portrait;
            this.name = userInfo.name;
            this.sex = userInfo.sex;
            this.distance = userInfo.distance;
            this.intro = userInfo.intro;
            this.tshow_icon = userInfo.tshow_icon;
            this.location = userInfo.location;
            this.tag_name = userInfo.tag_name;
            this.st_type = userInfo.st_type;
            this.message = userInfo.message;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new UserInfo(this, z, null);
            }
            return (UserInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1868889379, "Ltbclient/RecommendFriend/UserInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1868889379, "Ltbclient/RecommendFriend/UserInfo;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_SEX = 0;
        DEFAULT_DISTANCE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfo(Builder builder, boolean z) {
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
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            Integer num = builder.sex;
            if (num == null) {
                this.sex = DEFAULT_SEX;
            } else {
                this.sex = num;
            }
            Integer num2 = builder.distance;
            if (num2 == null) {
                this.distance = DEFAULT_DISTANCE;
            } else {
                this.distance = num2;
            }
            String str3 = builder.intro;
            if (str3 == null) {
                this.intro = "";
            } else {
                this.intro = str3;
            }
            this.tshow_icon = builder.tshow_icon;
            this.location = builder.location;
            String str4 = builder.tag_name;
            if (str4 == null) {
                this.tag_name = "";
            } else {
                this.tag_name = str4;
            }
            String str5 = builder.st_type;
            if (str5 == null) {
                this.st_type = "";
            } else {
                this.st_type = str5;
            }
            String str6 = builder.message;
            if (str6 == null) {
                this.message = "";
                return;
            } else {
                this.message = str6;
                return;
            }
        }
        this.id = builder.id;
        this.portrait = builder.portrait;
        this.name = builder.name;
        this.sex = builder.sex;
        this.distance = builder.distance;
        this.intro = builder.intro;
        this.tshow_icon = builder.tshow_icon;
        this.location = builder.location;
        this.tag_name = builder.tag_name;
        this.st_type = builder.st_type;
        this.message = builder.message;
    }

    public /* synthetic */ UserInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
