package tbclient.GameIndex;

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
import tbclient.GameInfo;
/* loaded from: classes9.dex */
public final class CategoryList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<GameInfo> DEFAULT_CATEGORY_GAME_LIST;
    public static final Integer DEFAULT_CATEGORY_ID;
    public static final String DEFAULT_CATEGORY_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GameInfo> category_game_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String category_name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List category_game_list;
        public Integer category_id;
        public String category_name;

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
        public Builder(CategoryList categoryList) {
            super(categoryList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {categoryList};
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
            if (categoryList == null) {
                return;
            }
            this.category_name = categoryList.category_name;
            this.category_game_list = Message.copyOf(categoryList.category_game_list);
            this.category_id = categoryList.category_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CategoryList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new CategoryList(this, z, null);
            }
            return (CategoryList) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-559125274, "Ltbclient/GameIndex/CategoryList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-559125274, "Ltbclient/GameIndex/CategoryList;");
                return;
            }
        }
        DEFAULT_CATEGORY_GAME_LIST = Collections.emptyList();
        DEFAULT_CATEGORY_ID = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryList(Builder builder, boolean z) {
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
            String str = builder.category_name;
            if (str == null) {
                this.category_name = "";
            } else {
                this.category_name = str;
            }
            List list = builder.category_game_list;
            if (list == null) {
                this.category_game_list = DEFAULT_CATEGORY_GAME_LIST;
            } else {
                this.category_game_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.category_id;
            if (num == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
                return;
            } else {
                this.category_id = num;
                return;
            }
        }
        this.category_name = builder.category_name;
        this.category_game_list = Message.immutableCopyOf(builder.category_game_list);
        this.category_id = builder.category_id;
    }

    public /* synthetic */ CategoryList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
