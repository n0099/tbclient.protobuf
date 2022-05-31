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
/* loaded from: classes8.dex */
public final class TabPicDesc extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_PIC_HEIGHT;
    public static final Integer DEFAULT_PIC_WIDTH;
    public static final String DEFAULT_SELECTED_PIC_URL = "";
    public static final String DEFAULT_UNSELECTED_PIC_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pic_height;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pic_width;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String selected_pic_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String unselected_pic_url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<TabPicDesc> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer pic_height;
        public Integer pic_width;
        public String selected_pic_url;
        public String unselected_pic_url;

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
        public Builder(TabPicDesc tabPicDesc) {
            super(tabPicDesc);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {tabPicDesc};
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
            if (tabPicDesc == null) {
                return;
            }
            this.selected_pic_url = tabPicDesc.selected_pic_url;
            this.unselected_pic_url = tabPicDesc.unselected_pic_url;
            this.pic_height = tabPicDesc.pic_height;
            this.pic_width = tabPicDesc.pic_width;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabPicDesc build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TabPicDesc(this, z, null) : (TabPicDesc) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-9148437, "Ltbclient/TabPicDesc;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-9148437, "Ltbclient/TabPicDesc;");
                return;
            }
        }
        DEFAULT_PIC_HEIGHT = 0;
        DEFAULT_PIC_WIDTH = 0;
    }

    public /* synthetic */ TabPicDesc(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabPicDesc(Builder builder, boolean z) {
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
            String str = builder.selected_pic_url;
            if (str == null) {
                this.selected_pic_url = "";
            } else {
                this.selected_pic_url = str;
            }
            String str2 = builder.unselected_pic_url;
            if (str2 == null) {
                this.unselected_pic_url = "";
            } else {
                this.unselected_pic_url = str2;
            }
            Integer num = builder.pic_height;
            if (num == null) {
                this.pic_height = DEFAULT_PIC_HEIGHT;
            } else {
                this.pic_height = num;
            }
            Integer num2 = builder.pic_width;
            if (num2 == null) {
                this.pic_width = DEFAULT_PIC_WIDTH;
                return;
            } else {
                this.pic_width = num2;
                return;
            }
        }
        this.selected_pic_url = builder.selected_pic_url;
        this.unselected_pic_url = builder.unselected_pic_url;
        this.pic_height = builder.pic_height;
        this.pic_width = builder.pic_width;
    }
}
