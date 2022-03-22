package tbclient.ForumMenu;

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
/* loaded from: classes8.dex */
public final class SubMenu extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACTION_TYPE;
    public static final String DEFAULT_CONTENT = "";
    public static final Integer DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_ID;
    public static final Integer DEFAULT_LEVEL;
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_PARENT_ID;
    public static final Integer DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer action_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer parent_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer update_time;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SubMenu> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer action_type;
        public String content;
        public Integer forum_id;
        public Integer id;
        public Integer level;
        public String name;
        public Integer parent_id;
        public Integer update_time;

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
        public Builder(SubMenu subMenu) {
            super(subMenu);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {subMenu};
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
            if (subMenu == null) {
                return;
            }
            this.id = subMenu.id;
            this.forum_id = subMenu.forum_id;
            this.level = subMenu.level;
            this.parent_id = subMenu.parent_id;
            this.name = subMenu.name;
            this.action_type = subMenu.action_type;
            this.update_time = subMenu.update_time;
            this.content = subMenu.content;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubMenu build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new SubMenu(this, z, null) : (SubMenu) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-859812363, "Ltbclient/ForumMenu/SubMenu;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-859812363, "Ltbclient/ForumMenu/SubMenu;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_FORUM_ID = 0;
        DEFAULT_LEVEL = 0;
        DEFAULT_PARENT_ID = 0;
        DEFAULT_ACTION_TYPE = 0;
        DEFAULT_UPDATE_TIME = 0;
    }

    public /* synthetic */ SubMenu(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubMenu(Builder builder, boolean z) {
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
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            Integer num2 = builder.forum_id;
            if (num2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num2;
            }
            Integer num3 = builder.level;
            if (num3 == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = num3;
            }
            Integer num4 = builder.parent_id;
            if (num4 == null) {
                this.parent_id = DEFAULT_PARENT_ID;
            } else {
                this.parent_id = num4;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num5 = builder.action_type;
            if (num5 == null) {
                this.action_type = DEFAULT_ACTION_TYPE;
            } else {
                this.action_type = num5;
            }
            Integer num6 = builder.update_time;
            if (num6 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = num6;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
                return;
            } else {
                this.content = str2;
                return;
            }
        }
        this.id = builder.id;
        this.forum_id = builder.forum_id;
        this.level = builder.level;
        this.parent_id = builder.parent_id;
        this.name = builder.name;
        this.action_type = builder.action_type;
        this.update_time = builder.update_time;
        this.content = builder.content;
    }
}
