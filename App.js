import React from 'react';
import configureStore from './src/store/configureStore'
const store = configureStore()

import NavigationRootContainer from './src/containers/navRootContainer'
import { Provider } from 'react-redux'

export default class App extends React.Component {
  render() {
    return (
      <Provider store={store}>
        <NavigationRootContainer />
      </Provider>
    );
  }
}
