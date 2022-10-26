package tbclient.GetGiftList;

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
public final class PresentCategoryList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CATEGORY_ID;
    public static final String DEFAULT_CATEGORY_NAME = "";
    public static final List<Integer> DEFAULT_GIFT_IDS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT32)
    public final List<Integer> gift_ids;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer category_id;
        public String category_name;
        public List gift_ids;

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
        public Builder(PresentCategoryList presentCategoryList) {
            super(presentCategoryList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {presentCategoryList};
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
            if (presentCategoryList == null) {
                return;
            }
            this.category_id = presentCategoryList.category_id;
            this.category_name = presentCategoryList.category_name;
            this.gift_ids = Message.copyOf(presentCategoryList.gift_ids);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentCategoryList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PresentCategoryList(this, z, null);
            }
            return (PresentCategoryList) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1622044377, "Ltbclient/GetGiftList/PresentCategoryList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1622044377, "Ltbclient/GetGiftList/PresentCategoryList;");
                return;
            }
        }
        DEFAULT_CATEGORY_ID = 0;
        DEFAULT_GIFT_IDS = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentCategoryList(Builder builder, boolean z) {
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
            Integer num = builder.category_id;
            if (num == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num;
            }
            String str = builder.category_name;
            if (str == null) {
                this.category_name = "";
            } else {
                this.category_name = str;
            }
            List list = builder.gift_ids;
            if (list == null) {
                this.gift_ids = DEFAULT_GIFT_IDS;
                return;
            } else {
                this.gift_ids = Message.immutableCopyOf(list);
                return;
            }
        }
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
        this.gift_ids = Message.immutableCopyOf(builder.gift_ids);
    }

    public /* synthetic */ PresentCategoryList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
