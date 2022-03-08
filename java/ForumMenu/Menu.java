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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class Menu extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACTION_TYPE;
    public static final String DEFAULT_CONTENT = "";
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_ID;
    public static final Integer DEFAULT_LEVEL;
    public static final String DEFAULT_NAME = "";
    public static final List<SubMenu> DEFAULT_SUB_MENU;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer action_type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<SubMenu> sub_menu;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Menu> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer action_type;
        public String content;
        public Integer create_time;
        public Integer forum_id;
        public Integer id;
        public Integer level;
        public String name;
        public List<SubMenu> sub_menu;

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
        public Builder(Menu menu) {
            super(menu);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {menu};
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
            if (menu == null) {
                return;
            }
            this.id = menu.id;
            this.forum_id = menu.forum_id;
            this.level = menu.level;
            this.name = menu.name;
            this.action_type = menu.action_type;
            this.create_time = menu.create_time;
            this.content = menu.content;
            this.sub_menu = Message.copyOf(menu.sub_menu);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Menu build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Menu(this, z, null) : (Menu) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2115282883, "Ltbclient/ForumMenu/Menu;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2115282883, "Ltbclient/ForumMenu/Menu;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_FORUM_ID = 0;
        DEFAULT_LEVEL = 0;
        DEFAULT_ACTION_TYPE = 0;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_SUB_MENU = Collections.emptyList();
    }

    public /* synthetic */ Menu(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Menu(Builder builder, boolean z) {
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
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num4 = builder.action_type;
            if (num4 == null) {
                this.action_type = DEFAULT_ACTION_TYPE;
            } else {
                this.action_type = num4;
            }
            Integer num5 = builder.create_time;
            if (num5 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num5;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            List<SubMenu> list = builder.sub_menu;
            if (list == null) {
                this.sub_menu = DEFAULT_SUB_MENU;
                return;
            } else {
                this.sub_menu = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.forum_id = builder.forum_id;
        this.level = builder.level;
        this.name = builder.name;
        this.action_type = builder.action_type;
        this.create_time = builder.create_time;
        this.content = builder.content;
        this.sub_menu = Message.immutableCopyOf(builder.sub_menu);
    }
}
