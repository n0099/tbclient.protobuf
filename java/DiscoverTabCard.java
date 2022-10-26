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
/* loaded from: classes9.dex */
public final class DiscoverTabCard extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST;
    public static final Boolean DEFAULT_IS_SHOW_ORDER_NUMBER;
    public static final String DEFAULT_JUMP_NAME = "";
    public static final String DEFAULT_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecommendForumInfo> forum_list;
    @ProtoField(tag = 4, type = Message.Datatype.BOOL)
    public final Boolean is_show_order_number;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List forum_list;
        public Boolean is_show_order_number;
        public String jump_name;
        public String name;

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
        public Builder(DiscoverTabCard discoverTabCard) {
            super(discoverTabCard);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {discoverTabCard};
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
            if (discoverTabCard == null) {
                return;
            }
            this.name = discoverTabCard.name;
            this.forum_list = Message.copyOf(discoverTabCard.forum_list);
            this.jump_name = discoverTabCard.jump_name;
            this.is_show_order_number = discoverTabCard.is_show_order_number;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DiscoverTabCard build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DiscoverTabCard(this, z, null);
            }
            return (DiscoverTabCard) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-824798071, "Ltbclient/DiscoverTabCard;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-824798071, "Ltbclient/DiscoverTabCard;");
                return;
            }
        }
        DEFAULT_FORUM_LIST = Collections.emptyList();
        DEFAULT_IS_SHOW_ORDER_NUMBER = Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverTabCard(Builder builder, boolean z) {
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
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            List list = builder.forum_list;
            if (list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.jump_name;
            if (str2 == null) {
                this.jump_name = "";
            } else {
                this.jump_name = str2;
            }
            Boolean bool = builder.is_show_order_number;
            if (bool == null) {
                this.is_show_order_number = DEFAULT_IS_SHOW_ORDER_NUMBER;
                return;
            } else {
                this.is_show_order_number = bool;
                return;
            }
        }
        this.name = builder.name;
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
        this.jump_name = builder.jump_name;
        this.is_show_order_number = builder.is_show_order_number;
    }

    public /* synthetic */ DiscoverTabCard(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
